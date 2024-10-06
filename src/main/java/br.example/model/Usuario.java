package br.example.model;

import java.util.Objects;

public class Usuario {

    private Integer id;
    private String login;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String password;
    private String role;

    public Role getRole1() {
        return role1;
    }

    public void setRole1(Role role1) {
        this.role1 = role1;
    }

    private Role role1;
    public Usuario(){}

    public Usuario(String login, String password, String role, Role role1) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.role1 = role1;
    }

    public Usuario(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) && Objects.equals(login, usuario.login) && Objects.equals(password, usuario.password) && Objects.equals(role, usuario.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, role);
    }

    public void setRole(String role) {
        this.role = role;
    }


}
