package br.example.acao;

import br.example.dao.UsuarioDao;
import br.example.model.Role;
import br.example.model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdicionaUsuario {


    public void executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String role = req.getParameter("role");



        if(role.equals("1")){
            role = Role.ADMIN.getDescricao();
        }else{
            role = Role.USER.getDescricao();
        }

        Usuario usuario = new Usuario(login, password, role );
        new UsuarioDao().salvar(usuario);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/controladora?acao=ListaUsuarios");
        dispatcher.forward(req,resp);

    }


}
