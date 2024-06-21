package Test;

import Dao.TblUsuarioImp;
import Modelo.TblUsuario;

public class TestUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TblUsuario usuario = new TblUsuario();
		TblUsuarioImp crud = new TblUsuarioImp();
		
		usuario.setUsuario("chupapi");
		usuario.setPassword("hola");
		
		crud.RegistrarUsuario(usuario);
		
	}

}
