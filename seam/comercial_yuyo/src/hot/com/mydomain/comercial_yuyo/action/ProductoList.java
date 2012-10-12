package com.mydomain.comercial_yuyo.action;

import com.mydomain.comercial_yuyo.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("productoList")
public class ProductoList extends EntityQuery<Producto> {

	private static final String EJBQL = "select producto from Producto producto";

	private static final String[] RESTRICTIONS = {
			"lower(producto.codigo) like lower(concat(#{productoList.producto.codigo},'%'))",
			"lower(producto.descripcion) like lower(concat(#{productoList.producto.descripcion},'%'))",
			"lower(producto.nombre) like lower(concat(#{productoList.producto.nombre},'%'))",};

	private Producto producto = new Producto();

	public ProductoList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Producto getProducto() {
		return producto;
	}
}
