package br.example.model;
public enum OpcoesMenu {
    SALVAR(1), IMPRMIR(2), ABRIR(3), VISUALIZAR(4), FECHAR(5);

    private final int valor;
    OpcoesMenu(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }

    public static void escolheOpcao(OpcoesMenu opcao){
        if(opcao == OpcoesMenu.SALVAR){
            System.out.println("Salvando o arquivo!");
        }
        else if(opcao == OpcoesMenu.ABRIR){
            System.out.println("Abrindo o arquivo!");
        }
    }
    public static void main(String[] args) {

        escolheOpcao(OpcoesMenu.ABRIR);
        }

}