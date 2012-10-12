package com.mydomain.comercial_yuyo.action;

import com.mydomain.comercial_yuyo.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("ventaList")
public class VentaList extends EntityQuery<Venta> {

	private static final String EJBQL = "select venta from Venta venta";

	private static final String[] RESTRICTIONS = {};

	private Venta venta = new Venta();

	public VentaList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Venta getVenta() {
		return venta;
	}
}
