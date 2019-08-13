import java.io.ObjectInputStream.GetField;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TesteAgora {
	
	private static boolean confiasse;
	
	private static int nanu;



	public static void main(String[] args) {
		
		//Conta conta = new Conta();
		Cliente clientex = new  Cliente();
		String menunome;
		
		boolean teparte = true; //p1 while
		while(teparte == true) {
		System.out.println("Boas Vindas, Você quer comprar uma passagem? \nDigite [1] para sim e [2] para não.");
		Scanner entradamenuscan = new Scanner(System.in);
		String menuvalidacao = entradamenuscan.nextLine();
		
				
		switch(menuvalidacao) {
		case "1": System.out.println("Ok iniciaremos a venda...");
		System.out.println("Agora precisamos que digite seu nome por favor.");
		Cliente nomemet = new Cliente(); //criação do new cliente(nomemet)
		clientex.setTitular(nomemet);
		nomemet.setNome("");
		System.out.println("Obrigado "+(nomemet.getNome())+" agora digite seu numero de pessoa fisica(CPF).");
		
		nomemet.setCpf("");
		
		
		
		////cpf
		
		boolean pass2 = true;
		while(pass2 == true) {
		System.out.println("Nome e CPF cadastrados "+(nomemet.getNome())+". Você quer comprar a passagem? \nDigite [s] para sim e [n] para não.");
		Scanner entradapassagemscan = new Scanner(System.in);
		String menupassagem = entradapassagemscan.nextLine();
		
		switch(menupassagem) {
		case "s": //System.out.println("ok te venderemos ");
	
		
		clientex.setOrigem(""); // escolhe o valor
		clientex.getOrigem(); //retorna o valor 		
		
		
		//String oneorigem = conta.getOrigem();
		//int nova = 1;
		
		
		
		
		//if(conta.getValidador() == true ) {
			
			
			boolean wwwass = true;
		//	while(wwwass == true) {
				//conta.setAssento(0);
				//conta.getAssento();
			
			while(wwwass == true) {
				System.out.println("Escolha qualquer um dos assentos numerados de 1 até 180.");
			
			Scanner ler = new Scanner(System.in);
				try {

				 nanu = 	ler.nextInt();
				
				///
			 boolean ass1 = false;
			 boolean ass2 = false;			
				if(nanu >=1) {
					ass1 = true;				
				}
				if(nanu <=180) {
					ass2 = true;					
				}						
				if(ass1 == true && ass2 == true) {					
					System.out.println("Assento disponível, ótima escolha e obrigado por escolher nossa compania.");
					confiasse = false;
					//wassento = false;//fassowassento
					wwwass = false;
				}
				else {			
					System.out.println("Opção de assento indisponível ou inexistente, por favor tente novamente.");		
					wwwass = true;
				}

				
					
				
				} catch(InputMismatchException erromeu) {
					System.out.println("Você só pode informar números inteiros, por favor tente novamente.");
				wwwass = true;
				
				} 
			}
			

		
		//}else {
		
		
		
		//}
		
		if(confiasse == false) {
			System.out.println("Bilhete comprado com sucesso.Comprovante do bilhete abaixo... \n"
					+ " *Passageiro: "+nomemet.getNome()+".\n "+
					"*CPF: "+nomemet.getCpf()+"."+"\n "
							+ "*Origem: "+clientex.getOrigem()+"."+"\n "+"*Destino: "+clientex.getDestino()+"\n "+
					"*Assento nº: " + nanu + "."+"\n "+"**BILHETE AUTORIZADO.**");
			pass2 = false;
			teparte = false;
			
		}else {
			
		}
		break;
			
		case "n": System.out.println("OK até a proxima");
		pass2 = false;
		teparte = false;
		break;
		default: System.out.println("Opção inválida!! Tente novamente.");break;
		}
		}		
		
		break;	
	
		case "2": System.out.println("Ok volte sempre.");
		teparte = false;
		break;
		default: System.out.println("Opção inválida!! Tente novamente.");break;
		}
		}

	}

}
