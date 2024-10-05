package servlet;



import br.example.dao.UsuarioDao;
import br.example.model.Role;
import br.example.model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/adicionaUsuario")
public class AdicionaUsuarioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String role = req.getParameter("role");
        Usuario usuario = new Usuario(login, password, role );
        //String data = request

         int opcao = Integer.valueOf( req.getParameter("role"));
         String r ="";
         if(opcao == 1){
              r = Role.ADMIN.getDescricao();
         }else{
            r = Role.USER.getDescricao();
         }
         usuario.setRole(r);



        new UsuarioDao().salvar(usuario);
        PrintWriter writer = resp.getWriter();
        writer.print("<html>");
        writer.print("<body>");
        writer.print("<h1>Usuário adicionado com sucesso!</h1>");
        writer.print("</body>");
        writer.print("</html>");

    }
}
