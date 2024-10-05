<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.example.dao.UsuarioDao, br.example.dao.ConnectionFactory, br.example.model.Usuario ,java.util.List,java.util.ArrayList"%>


<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
    <h1>Listar Usuários</h1>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">Login</th>
             <th scope="col">Role</th>
        </tr>


        </thead>
        <tbody>
        <%

            List<Usuario> usuarios = new ArrayList<Usuario>();
            usuarios = new UsuarioDao().getUsuarios();
              for(Usuario u:usuarios){

        %>

        <tr>

            <td><%out.println(u.getLogin());%></td>
            <td><%out.println(u.getRole());%></td>


        </tr>
        <%
        }
      %>

        </tbody>
    </table>



</body>
</html>