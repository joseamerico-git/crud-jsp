<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

         <form action="controladora" method="GET">
            <input type="text" name="login">
            <input type="hidden" name ="acao" value="FiltrarUsuario">
            <input type="submit" value="Pesquisar" >
         </form>


    <table class="table">
        <thead>
        <tr>
            <th scope="col">Login</th>
             <th scope="col">Role</th>
             <th scope="col">Ação</th>
        </tr>


        </thead>
        <tbody>

    <c:forEach var="u" items="${usuarios}">
               <tr>

            <td>${u.getLogin()}</td>
            <td>${u.getRole()}</td>
            <td>
            <a href="controladora?acao=RemoveUsuario&id=${u.getId()}">Remover</a>
            <a href="controladora?acao=EditaUsuario&id=${u.getId()}">Editar</a>


            </td>

        </tr>

  </c:forEach>


        </tbody>
    </table>

    <script>
        var a = document.querySelector('a');
          a.select.addEventListener('change', function() {
          confirm("ola");
          }


    </script>

</body>
</html>