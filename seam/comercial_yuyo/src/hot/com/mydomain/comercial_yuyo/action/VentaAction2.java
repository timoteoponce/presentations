package com.mydomain.comercial_yuyo.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.international.StatusMessages;
import org.jboss.seam.log.Log;

import com.mydomain.comercial_yuyo.model.Cliente;
import com.mydomain.comercial_yuyo.model.DetalleVenta;
import com.mydomain.comercial_yuyo.model.DetalleVentaId;
import com.mydomain.comercial_yuyo.model.Producto;
import com.mydomain.comercial_yuyo.model.Venta;

@Name("ventaAction2")
@Scope(ScopeType.PAGE)
public class VentaAction2 {
	@Logger
	private Log log;

	@In
	StatusMessages statusMessages;

	@In
	EntityManager entityManager;

	private Venta newVenta = new Venta();
	private DetalleVenta newDetalleVenta = new DetalleVenta();
	{
		newVenta.setFecha(new Date());
		newVenta.setMonto(BigDecimal.valueOf(0));
		newDetalleVenta.setCantidad(1);
	}

	public List<Cliente> getClientes() {
		return entityManager.createQuery("SELECT t FROM Cliente t")
				.getResultList();
	}

	public List<Producto> getProductos() {
		return entityManager.createQuery("SELECT t FROM Producto t")
				.getResultList();
	}

	public List<DetalleVenta> getDetalleVenta() {
		return new ArrayList<DetalleVenta>(newVenta.getDetalleVentas());
	}

	public Venta getNewVenta() {
		return newVenta;
	}

	public DetalleVenta getNewDetalleVenta() {
		return newDetalleVenta;
	}

	public void addDetalleVenta() {
		newVenta.getDetalleVentas().add(newDetalleVenta);
		long costo = getCosto(newDetalleVenta);
		newVenta.setMonto(newVenta.getMonto().add(BigDecimal.valueOf(costo)));
		newDetalleVenta = new DetalleVenta();
		newDetalleVenta.setCantidad(1);
	}

	public void removeDetalleVenta(DetalleVenta detalle) {
		long costo = getCosto(detalle);
		newVenta.setMonto(newVenta.getMonto().subtract(
				BigDecimal.valueOf(costo)));
		newVenta.getDetalleVentas().remove(detalle);
	}

	private long getCosto(DetalleVenta detalle) {
		return detalle.getCantidad()
				* detalle.getProducto().getPrecio().longValue();
	}

	public String guardar() {
		if (newVenta.getDetalleVentas().isEmpty()) {
			statusMessages.add("Venta sin productos");
			return "";
		}
		entityManager.persist(newVenta);
		for (DetalleVenta detalle : newVenta.getDetalleVentas()) {
			detalle.setVenta(newVenta);
			DetalleVentaId id = new DetalleVentaId(detalle.getProducto()
					.getId(), detalle.getVenta().getId());
			detalle.setId(id);
			entityManager.persist(detalle);
		}
		statusMessages.add("Venta almacenada");
		return "SAVED";
	}

}
