package pl.atena.aj.be.sklep;

public class Article {
	
	private static int counter = 0;
	
	private int id;
	private String name;
	private double price;
	private String description;

    public Article(int id, String name, double price, String desc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = desc;

        Article.counter++;
    }

    public Article() {

        Article.counter++;
    }
	
	public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String desc) {
    	this.description = desc;
    }

    public static void resetCounter() {
    	Article.counter = 0;
    }
    
    public int getCounter() {
    	return Article.counter;
    }
    
    @Override
	public String toString() {
		return "Article " + getCounter() + " [id=" + id + ", name=" + name + ", price=" + price
				+ ", description=" + description + "]";
	}
}
