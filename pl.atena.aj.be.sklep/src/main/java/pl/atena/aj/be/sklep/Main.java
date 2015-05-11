package pl.atena.aj.be.sklep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		String input = "";
		try {
			input = readConsoleLine();
		} catch (IOException e) {
			System.out.println("Ups.");
		}
		
		System.out.println(input);
	}
//	public static void main(String[] args) throws IOException {
//		String input = readConsoleLine();
//		
//		System.out.println("Wpisales: " + input);
//	}

	public static String readConsoleLine() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String");
		
		return br.readLine();
	}
}
