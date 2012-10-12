package com.mydomain.comercial_yuyo.action;

import com.mydomain.comercial_yuyo.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("clienteList")
public class ClienteList extends EntityQuery<Cliente> {

	private static final String EJBQL = "select cliente from Cliente cliente";

	private static final String[] RESTRICTIONS = {
			"lower(cliente.apellido) like lower(concat(#{clienteList.cliente.apellido},'%'))",
			"lower(cliente.email) like lower(concat(#{clienteList.cliente.email},'%'))",
			"lower(cliente.nombre) like lower(concat(#{clienteList.cliente.nombre},'%'))",};

	private Cliente cliente = new Cliente();

	public ClienteList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Cliente getCliente() {
		return cliente;
	}
}
