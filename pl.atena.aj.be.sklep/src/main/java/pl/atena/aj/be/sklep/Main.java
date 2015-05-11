package pl.atena.aj.be.sklep;

public class Main {

    public static void main(String[] args) {

    	
    	/* 
    	 * Bez obslugi wyjatkow.
    	 */
    	
//    	System.out.println("Dzielenie przez zero: " + 1 / 0);
//    	
//    	int[] tab = {9, 298};
//    	
//    	System.out.println("Pierwszy element: " + tab[0]);
//    	System.out.println("Drugi element: " + tab[1]);
//    	System.out.println("Trzeci element: " + tab[2]);
    	
    	/*
    	 * Z obsluga wyjatklw.
    	 */
    	
    	try {
    		int x = 1 / 0;
    	} catch (ArithmeticException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	int[] tab = {8, 36};
    	
    	try {
    		int x = tab[2];
    	} catch (IndexOutOfBoundsException e) {
    		System.out.println(e.getMessage());
    	}
    }
}
