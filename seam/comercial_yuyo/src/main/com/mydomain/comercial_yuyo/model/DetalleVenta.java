package com.mydomain.comercial_yuyo.model;
// Generated Oct 9, 2012 11:29:33 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.validator.NotNull;

/**
 * DetalleVenta generated by hbm2java
 */
@Entity
@Table(name = "DETALLE_VENTA", schema = "PUBLIC", catalog = "TESTLOCAL")
public class DetalleVenta implements java.io.Serializable {

	private DetalleVentaId id;
	private Venta venta;
	private Producto producto;
	private int cantidad;

	public DetalleVenta() {
	}

	public DetalleVenta(DetalleVentaId id, Venta venta, Producto producto,
			int cantidad) {
		this.id = id;
		this.venta = venta;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idProducto", column = @Column(name = "ID_PRODUCTO", nullable = false)),
			@AttributeOverride(name = "idVenta", column = @Column(name = "ID_VENTA", nullable = false))})
	@NotNull
	public DetalleVentaId getId() {
		return this.id;
	}

	public void setId(DetalleVentaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_VENTA", nullable = false, insertable = false, updatable = false)
	@NotNull
	public Venta getVenta() {
		return this.venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PRODUCTO", nullable = false, insertable = false, updatable = false)
	@NotNull
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Column(name = "CANTIDAD", nullable = false)
	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}