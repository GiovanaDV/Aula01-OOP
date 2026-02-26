package br.com.fiapride.model;

public class CameraDigital {
	public String marca;
	public String nomeModelo;
	public double memoria;
	
	public CameraDigital (String marca, String nomeModelo){
		this.marca = marca;
		this.nomeModelo = nomeModelo;
		this.memoria = 0.0; 
	}
	
	public void tirarFoto(boolean foto) {
		if (foto = true) {
			this.memoria += 5;
			System.out.println("Foto tirada com sucesso!");
			return;
		}
		if (this.memoria > 10) {
			System.out.println("Mémoria Cheia!!");
		}
			
		
		
		
	}

}
