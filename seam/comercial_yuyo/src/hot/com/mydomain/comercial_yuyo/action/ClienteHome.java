package com.mydomain.comercial_yuyo.action;

import com.mydomain.comercial_yuyo.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("clienteHome")
public class ClienteHome extends EntityHome<Cliente> {

	public void setClienteId(Integer id) {
		setId(id);
	}

	public Integer getClienteId() {
		return (Integer) getId();
	}

	@Override
	protected Cliente createInstance() {
		Cliente cliente = new Cliente();
		return cliente;
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

	public Cliente getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Venta> getVentas() {
		return getInstance() == null ? null : new ArrayList<Venta>(
				getInstance().getVentas());
	}

}
