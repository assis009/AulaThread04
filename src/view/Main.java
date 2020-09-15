package view;

import controller.ThreadSapo;

// OBJETIVO: corrida de sapo 

public class Main {

	public static void main (String args[]){
		
		
		for(int i=0; i<5; i++){// chama as threads que controlam os sapos da corrida
		Thread sapo = new ThreadSapo(i+1);
		
		sapo.start();
		}
		
	}
}
