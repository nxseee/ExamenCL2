package Interfaces;

import java.util.List;

import Modelo.TblProducto;

public interface IProducto {

	
	public void RegistrarProducto(TblProducto producto);
	public List<TblProducto> ListarProducto();
}
