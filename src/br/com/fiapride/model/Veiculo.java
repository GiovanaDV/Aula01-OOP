package br.com.fiapride.model;

public class Veiculo {
	private String placa;
	private String modelo;
	
	//CONSTRUTOR
	public Veiculo(String placa, String modelo) {
		this.setPlaca(placa);
		this.modelo = modelo;
		System.out.println("Registro inicial: Um " + this.modelo + " nasceu com a placa " + this.placa);
	}
	
	//Apenas leitura
	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}
	
	//COMPORTAMENTO PUBLICO
	// método que programa principal vai chamar. Representa uma ação real
	public void atualizarPlaca(String novaPlaca) {
		System.out.println("Solicitada atualização de placa no Detran pro veículo " + this.modelo + "...");
		this.setPlaca(novaPlaca); //privado por conter regra de segurança
	}
	
	//SETTERS PRIVADOS (ninguem de fora da classe pode usar
	private void setPlaca(String novaPlaca) { //placa nao pode ser nula e nem vazia
		if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
			this.placa = novaPlaca;
			System.out.println("Sucesso: a placa agora é " + this.placa);
		}else {
			System.out.println("Erro de validação: a placa informada é inválida!");
		}
	}

	// método setModelo nao existe: não tem como um carro mudar de modelo na vida real
	

}
