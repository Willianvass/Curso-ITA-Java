public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	void acelerar(){ //Este é o Metodo
		velocidade += potencia;//velocidade = velocidade + potencia
	}
	
	void frear(){
		velocidade = velocidade / 2;
	}
	
	int getVelocidade() { //Metodo que retorna
		return velocidade;		
	}
	
	void imprimir(){
		System.out.println("O carro "+nome+" esta a velocidade de "+getVelocidade()+" Km/h ");//sysout + CTRL + Space		
	}
}
