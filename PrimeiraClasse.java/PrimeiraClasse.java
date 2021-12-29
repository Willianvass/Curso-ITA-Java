public class Nome_da_Classe{
	...
{

	//Como um sistema tem mmuita classes organizamos por Pacotes. EX:
package org.veiculos;

//Ao usar uma Classe precisa importar a Classe ou o pacote que ela esta. EX:
import java.util.*;
importa java.lang.math;

//Informações da classe fica nos Atributos. EX:
public class Nome_da_Classe {
	int potencia;
	float velocidade;//Variaveis dentro da minha classe - Cada objeto da classe terá um valor diferente
{

//Criando Objetos. EX:
carro fusca = new carro();//Carro é i tipo de varivel - NEW cria Objetos, nova instancia da classe carro

//Para acessar os atributos desse Carro
fusca.potencia = 2;
float v = fusca.velocidade;

//Classe pode ter Comportamento, que definimos a partir de metodos
public class carro{
	void acelerar(){
		velocidade += potencia;// Metodo somando potencia na velocidade
	}
	void frear(){
		velocidade *= 0.5;// Metodo frear diminuindo 0.5 a velocidade
	}

}
//METODOS
	void acelerar(){//vOID = Não retorna nada - () Metodo pode ter poarametros ou não
		velocidade += potencia//Metodo pode manipular a classe
	}
	fusca.acelerar();//Chamando os metodos - () Se tiver parametros
	fusca.frear();
