package Interfaces;

import java.util.List;

import Modelo.TblUsuario;

public interface iUsuario {
	
	public void RegistrarUsuario(TblUsuario usuario);
	public List<TblUsuario> ListarUsuario();

}
