package com.mydomain.comercial_yuyo.action;

import com.mydomain.comercial_yuyo.model.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("detalleVentaHome")
public class DetalleVentaHome extends EntityHome<DetalleVenta> {

	@In(create = true)
	ProductoHome productoHome;
	@In(create = true)
	VentaHome ventaHome;

	public void setDetalleVentaId(DetalleVentaId id) {
		setId(id);
	}

	public DetalleVentaId getDetalleVentaId() {
		return (DetalleVentaId) getId();
	}

	public DetalleVentaHome() {
		setDetalleVentaId(new DetalleVentaId());
	}

	@Override
	public boolean isIdDefined() {
		if (getDetalleVentaId().getIdProducto() == 0)
			return false;
		if (getDetalleVentaId().getIdVenta() == 0)
			return false;
		return true;
	}

	@Override
	protected DetalleVenta createInstance() {
		DetalleVenta detalleVenta = new DetalleVenta();
		detalleVenta.setId(new DetalleVentaId());
		return detalleVenta;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Producto producto = productoHome.getDefinedInstance();
		if (producto != null) {
			getInstance().setProducto(producto);
		}
		Venta venta = ventaHome.getDefinedInstance();
		if (venta != null) {
			getInstance().setVenta(venta);
		}
	}

	public boolean isWired() {
		if (getInstance().getProducto() == null)
			return false;
		if (getInstance().getVenta() == null)
			return false;
		return true;
	}

	public DetalleVenta getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
