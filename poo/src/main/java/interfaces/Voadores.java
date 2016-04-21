package interfaces;

import java.io.Serializable;

@FunctionalInterface
public interface Voadores extends Serializable {

	void voar();
	
	static void teste2(){
		
	}
	
	//default methods
	default void teste(){
		System.out.println("voadores");
	}
}
