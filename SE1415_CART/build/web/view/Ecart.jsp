<%-- 
    Document   : Ecart
    Created on : 15-Oct-2020, 10:34:00
    Author     : Trung
--%>

<%@page import="model.item"%>
<%@page import="java.util.List"%>
<%@page import="model.cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Shopping cart online</h1>
        <table border = "1px">
            <tr>
                <th>No</th>
                <th>Name</th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Money</th>
                <th>Action</th>
            </tr>
            <%
                if(session.getAttribute("cart") != null){
                    cart cart = session.getAttribute("cart");
                    List<item> list = cart.getCart();
                    int i = 1;
                    for (item elem : list) {                                                                                    
            %>
            <tr>
                <td><%=i++%></td>
                <td><%=elem.getPro().getName()%></td>
                <td><%=elem.getQuantity()%></td>
                <td><%=elem.getPro().getPrice()%></td>
                <td><%=(elem.getPro().getPrice() * elem.getQuantity())%></td>
                
            </tr>
            
        </table>
        
        
    </body>
</html>
