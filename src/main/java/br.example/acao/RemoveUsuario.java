package br.example.acao;

import br.example.dao.UsuarioDao;
import br.example.model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class RemoveUsuario {

    public void removeUsuarioById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsuarioDao dao = new UsuarioDao();
        String login = req.getParameter("login");
        String id = req.getParameter("id");
        Integer codigo = Integer.valueOf(id);
        new UsuarioDao().excluir(codigo);

        List<Usuario> usuarios= dao.getUsuariosNome(login);
        req.setAttribute("usuarios",usuarios);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/controladora?acao=ListaUsuarios");
        dispatcher.forward(req,resp);
    }
}
