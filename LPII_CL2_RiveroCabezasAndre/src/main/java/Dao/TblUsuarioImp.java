package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.iUsuario;
import Modelo.TblUsuario;

public class TblUsuarioImp implements iUsuario {

	@Override
	public void RegistrarUsuario(TblUsuario usuario) {
		EntityManagerFactory em = Persistence.createEntityManagerFactory("LPII_CL2_RiveroCabezasAndre");
	    EntityManager emanager = em.createEntityManager();
	    emanager.getTransaction().begin();
	    emanager.persist(usuario);
	    System.out.println("Usario Registrado");
	    emanager.getTransaction().commit();
	    emanager.close();
		
	}

	@Override
	public List<TblUsuario> ListarUsuario() {
		//establecemos la conexion con la unidad de persistencia..
		EntityManagerFactory fab=Persistence.createEntityManagerFactory("LPII_CL2_RiveroCabezasAndre");
		//gestionamos las entidades
		EntityManager  em=fab.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos la data de la base de datos
		List<TblUsuario> listado=em.createQuery("select c from TblUsuario c",TblUsuario.class).getResultList();
		//confirmamos la transaccion
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado
		return listado;
	}

}
