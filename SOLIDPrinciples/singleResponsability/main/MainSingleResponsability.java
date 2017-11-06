package main;

import entities.Purchase;

public class MainSingleResponsability {

	 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * En el principio de unica responsabilidad (Single Responsability):
         * 
         * - cada clase debe hacer una accion especifica
         * 
         *	Por lo tanto,
         * 
         * - el main ejecuta el programa
         */
       Purchase ob = new Purchase();
       ob.operacion();
       
    }
}
