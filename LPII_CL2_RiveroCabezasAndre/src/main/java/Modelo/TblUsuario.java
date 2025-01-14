package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_USUARIOCL2")
public class TblUsuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "IDUSUARIOCL2")
	private int idUsuario;
	
	@Column(name = "USUARIOCL2")
	private String usuario;
	
	@Column(name = "PASSWORDCL2")
	private String password;
	
	public TblUsuario() {
	}
	
	public TblUsuario(int idUsuario, String usuario, String password) {
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.password = password;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
