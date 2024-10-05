package br.example.dao;

import br.example.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    Connection connection = ConnectionFactory.getConnection();

    public void salvar(Usuario u) {
        try {
            String query = "INSERT INTO USUARIO (LOGIN, PASSWORD, ROLE)VALUES (?,?,?)";

            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getPassword());
            stmt.setString(3, u.getRole());

            stmt.execute();
            stmt.close();
            connection.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void alterar(Usuario u) {
        try {
            PreparedStatement stmt;
            stmt = connection.prepareStatement("UPDATE USUARIO SET LOGIN=?,PASSWORD=?,ROLE=? WHERE ID =?");
            stmt.setString(3, u.getLogin());
            stmt.setString(1, u.getPassword());
            stmt.setString(2, u.getRole());

            stmt.execute();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Usuario> getUsuarios() {
        Usuario usuario = new Usuario();
        List<Usuario> usuarios = new ArrayList<>();
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement("SELECT *FROM USUARIO");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("ID"));
                usuario.setLogin(rs.getString("LOGIN"));

                usuario.setRole(rs.getString("ROLE"));
                usuario.setPassword(rs.getString("PASSWORD"));

                usuarios.add(usuario);

            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return usuarios;
    }


    public boolean existeUsuario(int codigo) {
        Usuario usuario;
        boolean existe = false;
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement("SELECT * FROM USUARIO WHERE ID = ? ;");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("ID"));
                usuario.setLogin(rs.getString("LOGIN"));

                usuario.setRole(rs.getString("ROLE"));
                usuario.setPassword(rs.getString("PASSWORD"));
                existe = true;
            }

            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Cliente não encontrado!");
        }
        return existe;

    }

    public Usuario getClienteId(int codigo) {
        Usuario usuario = new Usuario();
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement("SELECT * FROM USUARIO WHERE ID = ? ;");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                usuario = new Usuario();
                usuario.setId(rs.getInt("ID"));
                usuario.setLogin(rs.getString("LOGIN"));

                usuario.setRole(rs.getString("ROLE"));
                usuario.setPassword(rs.getString("PASSWORD"));

            }
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Cliente não encontrado!");
        }
        return usuario;
    }

    public Usuario getUsuarioNome(String nome) {
        Usuario usuario = new Usuario();
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement("SELECT * FROM USUARIO WHERE NOME = ? ;");
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                usuario = new Usuario();
                usuario.setId(rs.getInt("ID"));
                usuario.setLogin(rs.getString("LOGIN"));

                usuario.setRole(rs.getString("ROLE"));
                usuario.setPassword(rs.getString("PASSWORD"));
            }
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }


    public List<Usuario> getUsuariosNome(String nome) {
        Usuario usuario = new Usuario();
        List<Usuario> clientes = new ArrayList<>();
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement("SELECT * FROM USUARIO WHERE LOGIN like ? LIMIT 5");
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("ID"));
                usuario.setLogin(rs.getString("LOGIN"));

                usuario.setRole(rs.getString("ROLE"));
                usuario.setPassword(rs.getString("PASSWORD"));

                clientes.add(usuario);

            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return clientes;
    }

    public Usuario getIndex(int index) {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = new UsuarioDao().getUsuarios();
        Usuario usuario = new Usuario();
        usuario = usuarios.get(index);
        return usuario;
    }

    public Usuario getIndex(int index, String nome) {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = new UsuarioDao().getUsuariosNome(nome);
        Usuario c = new Usuario();
        c = usuarios.get(index);
        return c;
    }

    public void excluir(int codigo) {
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement("DELETE FROM USUARIO WHERE ID = ?;");
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}