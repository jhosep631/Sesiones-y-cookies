
<%@page import="java.util.ArrayList"%>
<%@page import="com.emergentes.Tareas"%>
<%
    if (session.getAttribute("listTareas") == null){
        ArrayList<Tareas> lisaux = new ArrayList<Tareas>();
        session.setAttribute("listTareas", lisaux);
    }
    
    ArrayList<Tareas> listTareas = (ArrayList<Tareas>)session.getAttribute("listTareas");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="text-align: center">Tareas pendientes</h1>
        
        <a href="nuevo.jsp">Nuevo</a>
        <br><br>
    
        <table border="1" style="align-items: center; margin: 0 auto" >
            <tr>
                <th>Id</th>
                <th>Tareas</th>
                <th>Completado</th>
                <th></th>
            </tr>
            <%
                if (listTareas != null){
                    for (Tareas p : listTareas){
            %>
            <tr>
                <td style="text-align: center"><%= p.getId() %></td>
                <td style="text-align: center"><%= p.getTarea() %></td>
                <td style="text-align: center"><input type="checkbox" name="marca" value="ON" /></td>
                <td style="text-align: center"><a href="MainServlet?op=eliminar&id=<%= p.getId() %>">Eliminar</a></td>
            </tr>
            <%
                    }
                }
            %>
        </table>
    </body>
</html>
