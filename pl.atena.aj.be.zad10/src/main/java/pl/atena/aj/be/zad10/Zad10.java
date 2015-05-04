package pl.atena.aj.be.zad10;

public class Zad10 {

	public int[] processTable(int[][] input, String[] actions) {
		int size = actions.length;
		int sizeInner = input.length;
		
		if(size != input[0].length) {
			System.err.println("Rozmiar tablicy dzia³añ musi byæ równy rozmiarowi wewnêtrznych tablic input.");
			
			return null;
		}

		int[] result = new int[size];
		
		for (int i = 0; i < size; i++) {
			result[i] = input[0][i];
			
			for (int j = 1; j < sizeInner; j++) {
				switch (actions[i]) {
				case "/":
					result[i] /= input[j][i];
					break;

				case "-":
					result[i] -= input[j][i];
					break;

				case "*":
					result[i] *= input[j][i];
					break;

				default:
					result[i] += input[j][i];
					break;
				}
			}
		}

		return result;
	}
}
