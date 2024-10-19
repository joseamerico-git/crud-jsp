package br.example.acao;

import br.example.dao.UsuarioDao;
import br.example.model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

public class EditaUsuario extends HttpServlet {

    public void executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStr = req.getParameter("id");
        String login = req.getParameter("login");
        String role = req.getParameter("role");
        String password = req.getParameter("password");
        int id = Integer.valueOf(idStr);
        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario usuario = usuarioDao.getClienteId(id);
        req.setAttribute("usuario", usuario);
        Usuario usuarioAlterar = new Usuario(login,role,password);

        UsuarioDao dao = new UsuarioDao();
        //dao.alterar(usuarioAlterar);
        
        PrintWriter out = resp.getWriter();
        out.println("<b>Alterado com sucesso</b>");

        List<Usuario> usuarios= dao.getUsuariosNome(login);
        req.setAttribute("usuarios",usuarios);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/controladora?acao=ListaUsuarios");
        dispatcher.forward(req,resp);


    }
}
