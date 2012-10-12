package com.mydomain.comercial_yuyo.action;

import com.mydomain.comercial_yuyo.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("ventaHome")
public class VentaHome extends EntityHome<Venta> {

	@In(create = true)
	ClienteHome clienteHome;

	public void setVentaId(Integer id) {
		setId(id);
	}

	public Integer getVentaId() {
		return (Integer) getId();
	}

	@Override
	protected Venta createInstance() {
		Venta venta = new Venta();
		return venta;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Cliente cliente = clienteHome.getDefinedInstance();
		if (cliente != null) {
			getInstance().setCliente(cliente);
		}
	}

	public boolean isWired() {
		if (getInstance().getCliente() == null)
			return false;
		return true;
	}

	public Venta getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<DetalleVenta> getDetalleVentas() {
		return getInstance() == null ? null : new ArrayList<DetalleVenta>(
				getInstance().getDetalleVentas());
	}

}
