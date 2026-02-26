package br.com.fiapride.main;
import br.com.fiapride.model.CameraDigital;
//import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

	public static void main(String[] args) {
	//INSTANCIACAO
	//new = aloca memoria pra um novo obj
		
	CameraDigital camera1 = new CameraDigital("Nikon", "Modelo 2.0");
	System.out.println("Tirando fotos na camera 1");
	camera1.tirarFoto(1);
		
	CameraDigital camera2 = new CameraDigital("Sony", "Modelo 6.0");
	System.out.println("Gravando video na camera 2");
	camera2.gravarVideo(10);
		
		
		
	/*
	--- OBJ 1 
	Passageiro passageiro1 = new Passageiro();
	passageiro1.nome = "Ana Silva";
	passageiro1.saldo = 50.0;
	
	OUTRA FORMA:
	Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
    System.out.println("Regarga passageiro 1");
    passageiro1.adicionarSaldo(50.0);
	
	--- OBJ 2
	Passageiro passageiro2 = new Passageiro();
	passageiro2.nome = "Carlos Souza";
	passageiro2.saldo = 12.50;
	
	OUTRA FORMA
	Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
    System.out.println("Regarga passageiro 2");
    passageiro2.adicionarSaldo(12.5);
		
	//Exibindo dados no console
	 System.out.println("--- Sistema FiapRide ---");
     System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
     System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
        
     System.out.println("Pagando viagem do passageiro 1");
     passageiro1.pagarViagem(20); //viagem paga com sucesso
     System.out.println("Pagando viagem do passageiro 2");
     passageiro2.pagarViagem(20); //erro por nao ter saldo suficiente
	
		
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
*/
	}

}
