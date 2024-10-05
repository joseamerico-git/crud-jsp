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

    public void salvar(Usuario u)  {
      try{
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
            stmt = connection.prepareStatement("UPDATE CLIENTE SET LOGIN=?,PASSWORD=?,ROLE=? WHERE ID =?");
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


}
/*

#
#CRIAÇÃO DO SCRIPT

#GERANDO A BASE DE DADOS ........
#CREATE DATABSE jsp;

#GERANDO A TABELA DE USUÁRIO ....

CREATE TABLE USUARIO(
ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
LOGIN VARCHAR(50),
PASSWORD VARCHAR(50),
ROLE VARCHAR(20)
);

#INSERINDO O PRIMEIRO USUÁRIO....

INSERT INTO USUARIO (LOGIN, PASSWORD,ROLE) VALUES ("doiche","123","ROLE_ADMIN"); #"ROLE_USER"
 */