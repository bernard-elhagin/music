package pl.atena.aj.be.zad9;

public class Zad9 {
	   
    public <E> void swapRows(E[][] table, int row1, int row2) {
        if(table[row1] != null && table[row2] != null) {
            E[] tempRow = table[row1];
            table[row1] = table[row2];
            table[row2] = tempRow;
        }
    }
}