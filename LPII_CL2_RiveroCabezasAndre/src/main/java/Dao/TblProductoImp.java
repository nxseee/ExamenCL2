package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import Modelo.TblProducto;
import Modelo.TblUsuario;


public class TblProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProducto producto) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("LPII_CL2_RiveroCabezasAndre");
	    EntityManager emanager = em.createEntityManager();
	    emanager.getTransaction().begin();
	    emanager.persist(producto);
	    System.out.println("Producto Registrado");
	    emanager.getTransaction().commit();
	    emanager.close();
		
	}

	@Override
	public List<TblProducto> ListarProducto() {
		EntityManagerFactory fab=Persistence.createEntityManagerFactory("LPII_CL2_RiveroCabezasAndre");
		//gestionamos las entidades
		EntityManager  em=fab.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos la data de la base de datos
		List<TblProducto> listado=em.createQuery("select c from TblProducto c",TblProducto.class).getResultList();
		//confirmamos la transaccion
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado
		return listado;
	}
	


}
