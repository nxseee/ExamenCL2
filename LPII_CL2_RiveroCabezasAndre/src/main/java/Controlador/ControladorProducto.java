package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TblProductoImp;
import Modelo.TblProducto;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TblProducto producto=new TblProducto();
		TblProductoImp crud=new TblProductoImp();
		List<TblProducto> listadoproducto=crud.ListarProducto();
	
		//aplicamos un bucle
			/*	for(TblCliente lis:listadocliente){
					
					//imprimimos por pantalla
					System.out.println("codigo "+lis.getIdcliente()+
							" nombre "+lis.getNombre()+" apellido "+lis.getApellido()+" dni "+lis.getDni());
					
				}    //fin del bucle for...
				*/
		
		//asignamo el listado de clientes recuperados de la BD.
		request.setAttribute("listadoclientes",listadoproducto);	
		//response.getWriter().append("Controlador Cliente ").append(request.getContextPath());
	   //redireccionamos
		request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);
	
	}  //fin del metodo doget..


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
				//recuperamos los datos del formulario
				String nombre=request.getParameter("nombre");
				String estado=request.getParameter("estado");
				String descrip=request.getParameter("descrip");
				//instanciamos las respectivas clases...
				TblProducto producto=new TblProducto();
				TblProductoImp crud=new TblProductoImp();
				//asignamos valores
				producto.setNombre(nombre);
				producto.setEstado(estado);
				producto.setDescrip(descrip);

				//invocamos el metodo a registrar cliente en la bd
				crud.RegistrarProducto(producto);
				//actualizar el listado
				List<TblProducto> listadoproducto=crud.ListarProducto();
				//asignamo el listado de clientes recuperados de la BD.
			     request.setAttribute("listadoproducto",listadoproducto);
				//redireccionamos hacia el listado de clientes...
				request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);
	}

}
