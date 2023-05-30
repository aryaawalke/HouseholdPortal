<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.sql.*"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-color: #AFD8F2;
}
td {
  padding: 10px;
}

</style>
</head>
<body >

	
<h1><center>Online Household Food Business Portal</center></h1>
<p><center><h2></h2><b style="font-family: Bookman Old Style">Seller Profile Details</b></h2><br><br>
<b style="font-family:Georgia">The details of Sellers with their respective services is listed below</b>
<br><br>
<form >

<center><table border="4">

   <tr>
        <td> <b>Name</b></td>
        <td><b>Email</b></td>
        <td><b>Contact</b></td>
        <td><b>Address</b></td>
        <td><b>Product</b></td>
        <td><b>Product details</b></td>
        
   </tr>
<% 
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/household","root","Shweta@1234");
    Statement stmt =null;
    stmt = conn.createStatement();
    stmt.executeUpdate("update profile set fname='"+firstname+"',lname='"+lastname+"',email='"+email+"',contactNo='"+contact+"',address='"+address+"',prod='"+product+"',prod_details='"+product_dtls+"' where id= "1");
    response.senRedirect("Index.jsp");
    
    while(rs.next()){
 %>
    <tr><td>  <% out.println(rs.getString("firstname")); %>
     <% out.println(rs.getString("lastname")); %></td>
      
      <td> <%out.println( rs.getString("email")); %></td>
      <td> <% out.println(rs.getString("contact")); %></td>
      <td> <% out.println(rs.getString("address")); %></td>
      <td> <% out.println(rs.getString("product"));%></td>
    <td> <%out.println(rs.getString("product_dtls"));%></td>
    
     <%} }catch(Exception e){
    	 e.printStackTrace();
     }%>
     </table></form>

</body>
</html>