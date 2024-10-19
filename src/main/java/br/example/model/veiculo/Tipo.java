package br.example.model.veiculo;
/*
 * 
 * 
 */
public enum Tipo {
	CICLOMOTO("02"),
	MOTONETA("03"),
	MOTOCICLO("04"),
	TRICICLO("05"),
	AUTOMÓVEL("06"),
	MICROÔNIBUS("07"),
	ÔNIBUS("08"),
	REBOQUE("10"),
	SEMIRREBOQUE("11"),
	CAMINHONETA("13"),
	CAMINÃO("14"),
	C_TRATOR("17"),
	ESP_ÔNIBUS("22"),
	MISTO_CAM("23"),
	CARGA_CAM("24"),
	UTILITÁRIO("25"),
	MOTOR_CASA("26");
	
	private String descricao;
	private Tipo(String descricao) {
		// TODO Auto-generated constructor stub
		this.descricao = descricao;
	}
	public static void main(String[] args) {
		for(Tipo tp:Tipo.values()) {
			System.out.println(tp.name());
		}
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
