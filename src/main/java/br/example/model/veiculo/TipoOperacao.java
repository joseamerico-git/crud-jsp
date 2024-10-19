package br.example.model.veiculo;

public enum TipoOperacao {
			

	//1=Venda concessionária 2=Faturamento direto para consumidor final 3=Venda direta para grandes consumidores (frotista, governo, ...) 0=Outros
		    VENDA_CONCECIONARIA("1"),
		    FATURAMENTO_DIRETO_PARA_CONSUMIDOR_FINAL("2"),
			VENDA_DIRETA_GRANDES_CONSUMIDORES_FROTISTA_GOVENRNO("3"),
			OUTROS("0");
				
		   

		    private String descricao;
		    
		    
		   

			TipoOperacao(String descricao) {
				
		        this.descricao = descricao;
		    }

		    public String getDescricao() {
		        return descricao;
		    }
	
}
