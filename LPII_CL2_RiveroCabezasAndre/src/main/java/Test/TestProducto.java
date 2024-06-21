package Test;

import Dao.TblProductoImp;
import Modelo.TblProducto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		TblProducto producto = new TblProducto();
		TblProductoImp crud = new TblProductoImp();
		
		producto.setNombre("chupapi");
		producto.setPrecioComple(23);
		producto.setPrecioVenta(34);
		producto.setEstado("Nuevo");
		producto.setDescrip("Calidad");
		
		crud.RegistrarProducto(producto);

	}

}
