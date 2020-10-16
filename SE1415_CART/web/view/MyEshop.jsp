

<%@page import="model.product"%>
<%@page import="java.util.List"%>
<%@page import="dal.productDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script type="text/javascript">
            function buy(id) {
                document.f.action = "../../cart/process?id" + id;
                document.f.submit();
            }
        </script>
        <p><img src="../../web/images/giohang.png"></p>
        <h1>The list of products</h1>
        <form name="f" action="" method="post">
            Enter item number want to buy :
            <input type="number" name="num" value="1">
            <table border="1px"> 
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Action</th>
                </tr>
                <%
                    productDAO pdb = new productDAO();
                    List<product> list = pdb.getAll();
                    for (product elem : list) {

                %>
                <tr>
                    <td><%=elem.getId()%></td>
                    <td><%=elem.getName()%></td>
                    <td><button onclick="buy(<%=elem.getId()%>)">BUY</button></td>                    
                </tr>                
                <%
                    }
                %>
            </table>

            <input type="hidden" name="action" value="buyitem"/> 
        </form>
    </body>

</html>