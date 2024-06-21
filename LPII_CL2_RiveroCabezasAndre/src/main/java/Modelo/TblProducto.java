package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PRODUCTOCL2")
public class TblProducto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "IDPRODUCTOCL2")
	private int idProducto;
	
	@Column(name = "NOMBRECL2")
	private String nombre;
	
	@Column(name = "PRECIOVENTACL2")
	private double precioVenta;
	
	@Column(name = "PRECIOCOMPCL2")
	private double precioComple;
	
	@Column(name = "ESTADOCL2")
	private String estado;
	
	@Column(name = "DESCRIPCL2")
	private String descrip;
	
	public TblProducto() {
	}

	public TblProducto(int idProducto, String nombre, double precioVenta, double precioComple, String estado,
			String descrip) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.precioComple = precioComple;
		this.estado = estado;
		this.descrip = descrip;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getPrecioComple() {
		return precioComple;
	}

	public void setPrecioComple(double precioComple) {
		this.precioComple = precioComple;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
	
	
	
	
	
	
}
