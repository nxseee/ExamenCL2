/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.1
 * Generated at: 2024-06-21 06:52:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Modelo.TblProducto;

public final class ListadoProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1718942140899L));
    _jspx_dependants.put("jar:file:/C:/Users/User/Desktop/CL2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/LPII_CL2_RiveroCabezasAndre/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("jar:file:/C:/Users/User/Desktop/CL2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/LPII_CL2_RiveroCabezasAndre/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153403082000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Listado de Producto</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#c5dec9\">\r\n");
      out.write("<h1 align=\"center\">Listado de Producto</h1>\r\n");
      out.write("<h2 align=\"center\">\r\n");
      out.write("<a  href=\"RegistrarCliente.jsp\" style=\"text-decoration:none\">Registrar Producto</a>\r\n");
      out.write("</h2>\r\n");
      out.write("<table align=\"center\" border=\"2\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Nombre</td>\r\n");
      out.write("<td>Estado</td>\r\n");
      out.write("<td>Descripcion</td>\r\n");
      out.write("</tr>\r\n");

List<TblProducto> listadoproducto=(List<TblProducto>)request.getAttribute("listadoproducto");
if(listadoproducto!=null){
	
for(TblProducto lis:listadoproducto){

      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.print(lis.getIdProducto() );
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.print(lis.getNombre());
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.print(lis.getEstado() );
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.print(lis.getDescrip() );
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");

      }//cerramos la condicion...
}   //cerramos el bucle

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
