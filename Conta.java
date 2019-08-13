import java.util.Scanner;

public class Conta{
	Scanner entradax = new Scanner(System.in);
	Scanner cpfx = new Scanner(System.in);
	private String nome;
	private String cpf;
	
	Scanner origemx = new Scanner(System.in);
	Scanner destinox = new Scanner(System.in);
	Scanner assentox = new Scanner(System.in);
	Scanner oswitch = new Scanner(System.in);
	private Cliente titular;
	private String origem;
	private String destino;
	private int assento;
	 int assentovali;
	 private boolean validador;
	 private boolean validadorass;
	
		

	public boolean isValidadorass() {
		return validadorass;
	}

	public void setValidadorass(boolean validadorass) {
		this.validadorass = validadorass;
	}

	public boolean getValidador() {
		return validador;
	}

	public void setValidador(boolean validador) {
		this.validador = validador;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public String getOrigem() {
		return origem;
	
	}

	public void setOrigem(String origem) {
		
		boolean choiceall = true;
		while(choiceall == true) {
		System.out.println("Agora digite a UF do seu estado de origem. No momento temos as seguintes opções:\nRJ, SP, MG, PR, PI. \nPOR FAVOR DIGITE EM CAIXA ALTA(CAPS LOCK)");
		
		this.origem = origemx.nextLine();
		this.validador = true;
		this.validadorass = true;
		switch(this.origem) {
		
		case "RJ": //escolhirj
			choiceall = false;
			
			boolean choicerj = true;
			while(choicerj == true) {
			System.out.println("Você escolheu "+this.origem+" como local de origem.");	
			System.out.println("Por favor agora digite o numero referente a UF destino:");
			System.out.println("SP[1]  MG[2]  PR[3]  PI[4]");
		
			
			String meudestino = oswitch.nextLine();
			
			switch (meudestino) {//rj
			case "1"://rj
				System.out.println("Você escolheu como destino o estado de SP.");
				System.out.println("O valor da passem do "+getOrigem()+" a SP é : 250 Reais");
				setDestino("SP") ; 
				choicerj = false;
				
				
				
				break;
				
			case "2"://rj
				System.out.println("Você escolheu como destino o estado de MG.");
				System.out.println("O valor da passem do "+getOrigem()+" a MG é : 200 Reais");
				setDestino("MG") ;
				choicerj = false;
				break;
				
			case "3"://rj
				System.out.println("Você escolheu como destino o estado de PR.");
				System.out.println("O valor da passem do "+getOrigem()+" ao PR é : 350 Reais");
				setDestino("PR") ;
				choicerj = false;
				break;
				
			case "4"://rj
				System.out.println("Você escolheu como destino o estado de PI.");
				System.out.println("O valor da passem do "+getOrigem()+" ao PI é : 580 Reais");
				setDestino("PI") ;
				choicerj = false;
				break;
								

			default://rj
				System.out.println("Destino inválido, tente novamente.");
				this.validador = false;
				break;
			}
			}
		
	 
		break;
		
		case "SP": //escolhisp
			choiceall = false;
			boolean choicesp = true;
			while(choicesp == true) {
			System.out.println("Você escolheu "+this.origem+" como local de origem.");	
			System.out.println("Por favor agora digite o numero referente a UF destino:");
			System.out.println("RJ[1]  MG[2]  PR[3]  PI[4]");
		
			
			String meudestinosp = oswitch.nextLine();
			
			switch (meudestinosp) {//sp
			case "1"://sp
				System.out.println("Você escolheu como destino o estado do RJ.");
				System.out.println("O valor da passem do "+getOrigem()+" a RJ é : 240 Reais");
				setDestino("RJ") ; 
				choicesp = false;
			
				break;
				
			case "2"://sp
				System.out.println("Você escolheu como destino o estado de MG.");
				System.out.println("O valor da passem do "+getOrigem()+" a MG é : 230 Reais");
				setDestino("MG") ;
				choicesp = false;
				break;
				
			case "3"://sp
				System.out.println("Você escolheu como destino o estado de PR.");
				System.out.println("O valor da passem do "+getOrigem()+" ao PR é : 300 Reais");
				setDestino("PR") ;
				choicesp = false;
				break;
				
			case "4"://sp
				System.out.println("Você escolheu como destino o estado de PI.");
				System.out.println("O valor da passem do "+getOrigem()+" ao DF é : 590 Reais");
				setDestino("PI") ;
				choicesp = false;
				break;
								

			default://sp
				System.out.println("Destino inválido, tente novamente.");
				this.validador = false;
				break;
			}
			}
		
		break;
		
		case "MG"://escolhi minas
			choiceall = false;
			boolean choicemg = true;
			while(choicemg == true) {
			System.out.println("Você escolheu "+this.origem+" como local de origem.");	
			System.out.println("Por favor agora digite o numero referente a UF destino:");
			System.out.println("RJ[1]  SP[2]  PR[3]  PI[4]");
		
			
			String meudestinomg = oswitch.nextLine();
			
			switch (meudestinomg) {//mg
			case "1"://mg
				System.out.println("Você escolheu como destino o estado do RJ.");
				System.out.println("O valor da passem do "+getOrigem()+" a RJ é : 240 Reais");
				setDestino("RJ") ; 
				choicemg = false;
			
				break;
				
			case "2"://mg
				System.out.println("Você escolheu como destino o estado de SP.");
				System.out.println("O valor da passem do "+getOrigem()+" a SP é : 210 Reais");
				setDestino("SP") ;
				choicemg = false;
				break;
				
			case "3"://mg
				System.out.println("Você escolheu como destino o estado de PR.");
				System.out.println("O valor da passem do "+getOrigem()+" ao PR é : 340 Reais");
				setDestino("PR") ;
				choicemg = false;
				break;
				
			case "4"://mg
				System.out.println("Você escolheu como destino o estado de PI.");
				System.out.println("O valor da passem do "+getOrigem()+" ao PI é : 400 Reais");
				setDestino("PI") ;
				choicemg = false;
				break;
								

			default://mg
				System.out.println("Destino inválido, tente novamente.");
				this.validador = false;
				break;
			}
			}
		
		break;
		
		case "PR": //escolhipr
			choiceall = false;
			boolean choicepr = true;
			while(choicepr == true) {

			System.out.println("Você escolheu "+this.origem+" como local de origem.");	
			System.out.println("Por favor agora digite o numero referente a UF destino:");
			System.out.println("RJ[1]  SP[2]  MG[3]  PI[4]");
		
			
			String meudestinopr = oswitch.nextLine();
			
			switch (meudestinopr) {//pr
			case "1"://pr
				System.out.println("Você escolheu como destino o estado do RJ.");
				System.out.println("O valor da passem do "+getOrigem()+" a RJ é : 260 Reais");
				setDestino("RJ") ; 
				choicepr = false;
			
				break;
				
			case "2"://pr
				System.out.println("Você escolheu como destino o estado de SP.");
				System.out.println("O valor da passem do "+getOrigem()+" a SP é : 230 Reais");
				setDestino("SP") ;
				choicepr = false;
				break;
				
			case "3"://pr
				System.out.println("Você escolheu como destino o estado de MG.");
				System.out.println("O valor da passem do "+getOrigem()+" ao MG é : 360 Reais");
				setDestino("MG") ;
				choicepr = false;
				break;
				
			case "4"://pr
				System.out.println("Você escolheu como destino o estado de PI.");
				System.out.println("O valor da passem do "+getOrigem()+" ao PI é : 480 Reais");
				setDestino("PI") ;
				choicepr = false;
				break;
								

			default://pr
				System.out.println("Destino inválido, tente novamente.");
				this.validador = false;
				break;
			}
			}
			
		break;
		
		case "PI":  //escolhiPI
			boolean choicepi = true;
			while(choicepi == true) {
			choiceall = false;
			System.out.println("Você escolheu "+this.origem+" como local de origem.");	
			System.out.println("Por favor agora digite o numero referente a UF destino:");
			System.out.println("RJ[1]  SP[2]  MG[3]  PR[4]");
		
			
			String meudestinodf = oswitch.nextLine();
			
			switch (meudestinodf) {//PI
			case "1"://PI
				System.out.println("Você escolheu como destino o estado do RJ.");
				System.out.println("O valor da passem do "+getOrigem()+" a RJ é : 280 Reais");
				setDestino("RJ") ; 
				choicepi = false;
			
				break;
				
			case "2"://PI
				System.out.println("Você escolheu como destino o estado de SP.");
				System.out.println("O valor da passem do "+getOrigem()+" a SP é : 240 Reais");
				setDestino("SP") ;
				choicepi = false;
				break;
				
			case "3"://PI
				System.out.println("Você escolheu como destino o estado de MG.");
				System.out.println("O valor da passem do "+getOrigem()+" ao MG é : 350 Reais");
				setDestino("MG") ;
				choicepi = false;
				break;
				
			case "4"://PI
				System.out.println("Você escolheu como destino o estado de PR.");
				System.out.println("O valor da passem do "+getOrigem()+" ao PR é : 490 Reais");
				setDestino("PR") ;
				choicepi = false;
				break;
								

			default://PI
				System.out.println("Destino inválido, tente novamente.");
				this.validador = false;
				break;
			}
			}
		
		break;
		
		default: System.out.println(getOrigem()+" é uma resposta inválida por favor tente denovo.");
		this.validador = false;
		break;
		}
	}
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDestino() {
		return destino;
	}

///////
		
		/*	else if(getOrigem() =="RJ" && this.destino =="BA"){
				System.out.println("O valor da passem do "+getOrigem()+" a "+this.destino+"é : 800 Reais");
			}
			else if(getOrigem() =="SP" && this.destino =="MG") {
				System.out.println("O valor da passem de "+getOrigem()+" a "+this.destino+"é : 200 Reais");
			}
			else if(getOrigem() =="SP" && this.destino =="PR"){
				System.out.println("O valor da passem de "+getOrigem()+" ao "+this.destino+"é : 310 Reais");
			}
			else if(getOrigem() =="SP" && this.destino =="DF"){
				System.out.println("O valor da passem de "+getOrigem()+" ao "+this.destino+"é : 590 Reais");
			}
			else if(getOrigem() =="SP" && this.destino =="RJ"){
				System.out.println("O valor da passem do "+getOrigem()+" ao "+this.destino+"é : 200 Reais");
			}
			else if(getOrigem() =="SP" && this.destino =="BA"){
				System.out.println("O valor da passem do "+getOrigem()+" a "+this.destino+"é : 870 Reais");
			}
			else if(getOrigem() =="MG" && this.destino =="SP") {
				System.out.println("O valor da passem do "+getOrigem()+" a "+this.destino+"é : 200 Reais");
			}
			else if(getOrigem() =="MG" && this.destino =="PR"){
				System.out.println("O valor da passem do "+getOrigem()+" ao "+this.destino+"é : 400 Reais");
			}
			else if(getOrigem() =="MG" && this.destino =="DF"){
				System.out.println("O valor da passem do "+getOrigem()+" ao "+this.destino+"é : 350 Reais");
			}
			else if(getOrigem() =="MG" && this.destino =="RJ"){
				System.out.println("O valor da passem do "+getOrigem()+" ao "+this.destino+"é : 180 Reais");
			}
			else if(getOrigem() =="MG" && this.destino =="BA"){
				System.out.println("O valor da passem do "+getOrigem()+" a"+this.destino+"é : 850 Reais");
			}
			else if(getOrigem() =="PR" && this.destino =="SP") {
				System.out.println("O valor da passem do "+getOrigem()+" a "+this.destino+"é : 250 Reais");
			}
			else if(getOrigem() =="PR" && this.destino =="MG"){
				System.out.println("O valor da passem do "+getOrigem()+" a "+this.destino+"é : 420 Reais");
			}
			else if(getOrigem() =="PR" && this.destino =="DF"){
				System.out.println("O valor da passem do "+getOrigem()+" ao "+this.destino+"é : 380 Reais");
			}
			else if(getOrigem() =="PR" && this.destino =="RJ"){
				System.out.println("O valor da passem do "+getOrigem()+" ao "+this.destino+"é : 300 Reais");
			}
			else if(getOrigem() =="PR" && this.destino =="BA"){
				System.out.println("O valor da passem do "+getOrigem()+" a "+this.destino+"é : 900 Reais");
			}
			else if(getOrigem() =="DF" && this.destino =="SP") {
				System.out.println("O valor da passem do "+getOrigem()+" a "+this.destino+"é : 200 Reais");
			}
			else if(getOrigem() =="DF" && this.destino =="MG"){
				System.out.println("O valor da passem do "+getOrigem()+" a "+this.destino+"é : 200 Reais");
			}
			else if(getOrigem() =="DF" && this.destino =="PR"){
				System.out.println("O valor da passem do "+getOrigem()+" ao "+this.destino+"é : 310 Reais");
			}
			else if(getOrigem() =="DF" && this.destino =="RJ"){
				System.out.println("O valor da passem do "+getOrigem()+" ao "+this.destino+"é : 240 Reais");
			}
			else if(getOrigem() =="DF" && this.destino =="BA"){
				System.out.println("O valor da passem do "+getOrigem()+" a "+this.destino+"é : 710 Reais");
			}
			else if(getOrigem() =="BA" && this.destino =="SP") {
				System.out.println("O valor da passem do "+getOrigem()+" a "+this.destino+"é : 750 Reais");
			}
			else if(getOrigem() =="BA" && this.destino =="MG"){
				System.out.println("O valor da passem do "+getOrigem()+" a "+this.destino+"é : 620 Reais");
			}
			else if(getOrigem() =="BA" && this.destino =="PR"){
				System.out.println("O valor da passem do "+getOrigem()+" ao "+this.destino+"é : 820 Reais");
			}
			else if(getOrigem() =="BA" && this.destino =="RJ"){
				System.out.println("O valor da passem do "+getOrigem()+" ao "+this.destino+"é : 600 Reais");
			}
			else if(getOrigem() =="BA" && this.destino =="DF"){
				System.out.println("O valor da passem do "+getOrigem()+" ao "+this.destino+"é : 650 Reais");
			}
			

	//		--------			
		}else {
			System.out.println("O "+this.destino+" é o mesmo local de origem, por favor tente denovo.");
		}
		
		////
		
		
	}*/

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		
		/*
		
		//this.assento = assento;
		this.assento = assentox.nextInt();
		
		boolean ass1 = false;
		boolean ass2 = false;
		
		if(this.assento >=1) {
			ass1 = true;
			
		}
		if(this.assento <=180) {
			ass2 = true;
			
		}
		
		
		
		if(ass1 == true && ass2 == true) {
			
			System.out.println("Assento disponível, ótima escolha e obrigado por escolher nossa compania.");
		}
		else {			
			int assentovali = 2;
		//			
			switch (assentovali) {
			case 2: System.out.println("Opção de assento indisponível ou inexistente, por favor tente novamente.");				
			this.validador = false;	
			break;
			default:System.out.println("Assento não correspondente, por favor tente denovo.");
			this.validador = false;
				break;
			}*/
		
		} //fechamento else
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		System.out.println("Por favor digite seu Nome: ");
		 this.nome = entradax.nextLine() ;
	
	}
	public String getCpf() {
		return  cpf;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpfx.nextLine();
		//this.cpf = cpf;
		
   
		
	}
	
	//public Conta(String nome, String cpf) {
	//	this.nome = cpfx.nextLine();
		//this.cpf = entradax.nextLine();
		
	//}

		
		
		
		

	}
	
	
