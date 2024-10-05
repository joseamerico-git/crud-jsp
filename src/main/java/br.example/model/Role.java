package br.example.model;

public enum Role {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");
    private String descricao;

    Role(String descricao) {

        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }



}
