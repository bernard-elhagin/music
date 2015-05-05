package pl.atena.aj.be.sklep;

public class Article {
	private int id;
	private String name;
	private double price;
	private String description;

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
	
    @Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", price=" + price
				+ ", description=" + description + "]";
	}
}
