
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="modelo.listaFacturas"%>
<%@page import="modelo.Factura"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%List<Factura> facturas = listaFacturas.facturas;
 Collections.sort(facturas);%>
<!DOCTYPE html>
<html>
    <head>
        <style>
        body{
            display: flex;
            justify-content: center;
            align-items: center;
            background-image: url("./fondo2.jpg");
        }
        th,td{
            width: 20vh;
            padding:1%;
            border:1px solid rgb(54, 156, 54);
            background-color: rgba(0, 180, 45, 0.904);
            color: white;
            text-align: center;
        }
        table{
            margin-top:10vh;
            border:1px solid rgb(54, 156, 54);
            border-collapse: collapse; 
        }</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <th>Fecha</th>
            <th>Encargado</th>
            <th>Solicitante</th>
            <th>Precio</th>
            <th>Tipo de reparación</th>
            <th>Descripcion</th>
            
               
            <% for (int contador=0;contador<facturas.size();contador++){ %>
            <tr>
                <td><%=facturas.get(contador).getFecha()%></td>
                <td><%=facturas.get(contador).getEncargado()%></td>
                <td><%=facturas.get(contador).getSolicitante()%></td>
                <td><%=facturas.get(contador).getPrecio()%>€</td>
                <td><%=facturas.get(contador).getTipo()%></td>
                <td><%=facturas.get(contador).getDescripcion()%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
