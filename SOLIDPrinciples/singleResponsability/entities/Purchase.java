package entities;

import java.util.Scanner;

public class Purchase {

	/**
	 * 
	 * Realiza la operacion principal del programa que se ejecuta en el main. Cumple con
	 * el principio de única responsablilidad ya que cada clase realiza una sola funcion. 
	 * 
	 * No se cumpliría el principio si todo se encontrase en el Main.
	 */
	Scanner leer = new Scanner(System.in);
	Fruit obj = new Fruit();
	Apple apple = new Apple();
	Pear pear = new Pear();

	public void operacion(){
		
	        System.out.println("Ingresa la cantidad de manzanas");
	        apple.setQuantity(leer.nextInt());
	        System.out.println("Ingresa la cantidad de peras");
	        pear.setQuantity(leer.nextInt());
	        
	        obj.setApple(apple);
	        obj.setPear(pear);
	        
	        int resultado = obj.getApple().getQuantity() + obj.getPear().getQuantity();
	        System.out.printf("El resultado es %d frutas", resultado);
	}

}
