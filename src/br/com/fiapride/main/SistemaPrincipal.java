package br.com.fiapride.main;
import br.com.fiapride.model.CameraDigital;
//import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

	public static void main(String[] args) {
	//INSTANCIACAO
	//new = aloca memoria pra um novo obj
	/*
	Passageiro passageiro1 = new Passageiro();
	passageiro1.nome = "Ana Silva";
	passageiro1.saldo = 50.0;
	
	Passageiro passageiro2 = new Passageiro();
	passageiro2.nome = "Carlos Souza";
	passageiro2.saldo = 12.50;
		
	//Exibindo dados no console
	 System.out.println("--- Sistema FiapRide ---");
     System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
     System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
	*/
		
	CameraDigital camera1 = new CameraDigital();
	camera1.marca = "Canon";
	camera1.nomeModelo = "EOS Rebel T7";
	camera1.resolucao = 24.1;
	
	CameraDigital camera2 = new CameraDigital();
	camera2.marca = "Sony";
	camera2.nomeModelo = "Cyber-shot DSC-W830";
	camera2.resolucao = 20.1;
	
	System.out.println("--- Cameras Digitais ---");
    System.out.println("Camera: " + camera1.marca + " | Modelo: " + camera1.nomeModelo + " | Resolucao: " + camera1.resolucao);
    System.out.println("Camera: " + camera2.marca + " | Modelo: " + camera2.nomeModelo + " | Resolucao: " + camera2.resolucao);

	}

}
