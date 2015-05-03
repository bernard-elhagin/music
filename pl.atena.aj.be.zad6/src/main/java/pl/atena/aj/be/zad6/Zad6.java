package pl.atena.aj.be.zad6;

public class Zad6 {
	private int[][] values={ {3,8,16}, {1,22,28,24}, {3}, {41,42} };
	
	private int min = Integer.MAX_VALUE;
	private int max = Integer.MIN_VALUE;
	
	public int getMax() {
		setMinAndMax();
		return max;
	}
	
	public int getMin() {
		setMinAndMax();
		return min;
	}
	
	private void setMinAndMax() {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				int val = values[i][j];
				
				min = val < min ? val : min;
				max = val > max ? val : max;
			}
		}
	}
}