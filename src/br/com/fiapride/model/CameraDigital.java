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
	
	public void tirarFoto(double foto) {
		if (foto == 0) {
			System.out.println("Tecle 1 para tirar foto!");
			return;
		}
		if (foto == 1) {
			this.memoria += 5.0;
			System.out.println("Foto tirada com sucesso! Sua memoria é: " + this.memoria);
		}
			
		}
	
	public void gravarVideo(double tempo) {
		if (tempo > 15.0) {
			System.out.println("Vídeo maior que 15 minutos!");
			return;
		}
		if (tempo < 15.0) {
			this.memoria += 6.0;
			System.out.println("Vídeo gravado com sucesso! Sua memoria é: " + this.memoria);
		}
	}
}


