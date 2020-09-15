package controller;

import java.util.Random;
public class ThreadSapo extends Thread {
	
	int salto=0;
	static int posicao=1;
	int id;
	public ThreadSapo(int id) {
		this.id = id;
	}
	

	public void run() {
		
		int i=0; 
		Random gerador = new Random(3);
		
		while(i<20){
			
			salto= gerador.nextInt(11);//gerando numeros aleatorios para ser atribuidos para os saltos 
			System.out.println("\n** O sapo "+ id + " saltou: " +salto + " metros ");//avisa qual o tamanho da salto 
			i+=salto;//soma o valor gerado ao indice, quando atingir 20 saira do laço 
		}
		
		
		System.err.println("\n | O sapo "+id+" chegou! Ficou na posição : "+ posicao++);//avisa quue o sapo chegou e qual posicao
		
	}
}
