package servlet;

import acao.ListaUsuarios;

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

        if(acao.equals("ListaUsuarios")){
            new ListaUsuarios().executa(req,resp);
        }
        if(acao.equals("AdicionaUsuario")){

        }
    }
}
