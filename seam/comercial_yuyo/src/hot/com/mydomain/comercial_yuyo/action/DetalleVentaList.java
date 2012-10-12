package com.mydomain.comercial_yuyo.action;

import com.mydomain.comercial_yuyo.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("detalleVentaList")
public class DetalleVentaList extends EntityQuery<DetalleVenta> {

	private static final String EJBQL = "select detalleVenta from DetalleVenta detalleVenta";

	private static final String[] RESTRICTIONS = {};

	private DetalleVenta detalleVenta;

	public DetalleVentaList() {
		detalleVenta = new DetalleVenta();
		detalleVenta.setId(new DetalleVentaId());
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public DetalleVenta getDetalleVenta() {
		return detalleVenta;
	}
}
