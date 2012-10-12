package com.mydomain.comercial_yuyo.action;

import com.mydomain.comercial_yuyo.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("productoHome")
public class ProductoHome extends EntityHome<Producto> {

	public void setProductoId(Integer id) {
		setId(id);
	}

	public Integer getProductoId() {
		return (Integer) getId();
	}

	@Override
	protected Producto createInstance() {
		Producto producto = new Producto();
		return producto;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public Producto getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<DetalleVenta> getDetalleVentas() {
		return getInstance() == null ? null : new ArrayList<DetalleVenta>(
				getInstance().getDetalleVentas());
	}

}
