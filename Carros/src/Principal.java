public class Principal { //Vai em SRC file - class - marcar o metodo Main//

	public static void main(String[] args) {
		Carro c1 = new Carro(); //Instanciar
		c1.potencia = 10; //Inicializando as variaveis
		c1.nome = "Corcel"; //Dar nome
		c1.velocidade = 0;
		
		Carro c2 = new Carro(); //Criando outro carro
		c2.potencia = 15; 
		c2.nome = "Carrango"; 
		c2.velocidade = 0;
		
		Carro c3 = new Carro(); //Instanciar
		c3.potencia = 10; //Inicializando as variaveis
		c3.nome = "Corcel"; //Dar nome
		c3.velocidade = 0;
		
		c1.acelerar();
		c1.acelerar();//Acelerou 3 vezes e freou = 15 km
		c1.acelerar();
		c1.frear();
		
		c2.acelerar();
		c2.acelerar();
		
		c1.imprimir();
		c2.imprimir();
		System.out.println("Imprimindo C3");//C3 é igual C1 mas os objetos são unicos mesmo sendo iguais a outro
		c3.imprimir();
		}
	
}
