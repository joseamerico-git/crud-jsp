package servlet;

import br.example.acao.AdicionaUsuario;
import br.example.acao.EditaUsuario;
import br.example.acao.ListaUsuarios;
import br.example.acao.RemoveUsuario;
import br.example.dao.UsuarioDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controladora")
public class ControladoraService extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String acao = req.getParameter("acao");
        System.out.print("A ação executada foi: "+ acao);
        String method = req.getMethod();
        System.out.print("O Método foi : "+ method);
        String form = req.getRemoteUser();
        System.out.print("Usuário remoto : "+ form);
        if(acao.equals("ListaUsuarios")){
            new ListaUsuarios().executa(req,resp);
        }
       else if(acao.equals("AdicionaUsuario")){
            new AdicionaUsuario().executa(req,resp);
        }


        else if(acao.equals("FiltrarUsuario")){

            new ListaUsuarios().getUsuariosByLogin(req,resp);
        }
        else if(acao.equals("RemoveUsuario")){

            new RemoveUsuario().removeUsuarioById(req, resp);
        }
        else if(acao.equals("EditaUsuario")){
          //  new EditaUsuario().executa(req,resp);
            System.out.print(" editar");
        }



    }
}
