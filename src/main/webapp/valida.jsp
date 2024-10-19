<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/cine?action=LoginBean" var="login"/>
<c:url value="/cine?action=CadastroUsuarioBean" var="cadastroUsuario"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/login.css">
    <title>Login</title>
</head>
<body>
<div class="container" id="container">
<div class="form-container sign-up-container">
    <form action="${login}" method="post">
        <h1>Criar uma conta</h1>

        <span>ou use seu e-mail para cadastro</span>
        <input type="text" placeholder="First name" name="name"/>
        <input type="text" placeholder="Last name" name="surname"/>
        <input type="email" placeholder="Email" name="email"/>
        <input type="password" placeholder="Password" name="password"/>
        <input type="date" placeholder="date"/>

<select id="sexo" name="genero">
    <option value="" disabled selected>Selecione uma opção</option>
    <option value="feminino">Masculino</option>
    <option value="masculino">Feminino</option>
    <option value="outros">Outros</option>
</select>
        <button>Inscrever-se</button>
    </form>
</div>

<div class="form-container sign-in-container">
    <form action="${cadastroUsuario}" method="post">
        <h1>Entrar</h1>
        <span>ou se escrever-se</span>
        <input type="email" placeholder="Email" name="email"/>
        <input type="password" placeholder="Password" name="password"/>
        <a href="#">Esqueceu a senha ?</a>
        <button>Entrar</button>
    </form>
</div>
<div class="overlay-container">
    <div class="overlay">
        <div class="overlay-panel overlay-left">
            <h1>Bem vindo de volta!</h1>
            <p>Para se manter conectado conosco, faça login com suas informações</p>
            <button class="ghost" id="signIn">Entrar</button>
        </div>
        <div class="overlay-panel overlay-right">
            <h1>Olá, Amigo!</h1>
            <p>Insira seus dados e comece sua diversão conosoco</p>
            <button class="ghost" id="signUp">Inscrever-se</button>
        </div>
    </div>
</div>
</div>

<script src="scripts/login.js"></script>
</body>
</html>