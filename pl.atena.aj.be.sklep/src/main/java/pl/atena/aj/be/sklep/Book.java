package pl.atena.aj.be.sklep;

public class Book extends Article {

	private String author;

	private int pubYear;

	public Book() {
		super();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
		
		printChange();
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
		
		printChange();
	}
	
    @Override
    public String toString() {
        return super.toString() + "\nBook [author=" + author + ", pubYear=" + pubYear + "]";
    }
}
