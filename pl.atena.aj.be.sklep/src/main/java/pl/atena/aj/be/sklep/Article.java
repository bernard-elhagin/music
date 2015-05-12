package pl.atena.aj.be.sklep;

import java.math.BigDecimal;
import java.util.Scanner;

import pl.atena.aj.be.utils.BadArticleIDException;
import pl.atena.aj.be.utils.DescriptorParseError;
import pl.atena.aj.be.utils.ExistingIDException;

public class Article {

    private static int counter = 0;

    private int        ID;

    private String     name;

    private double     price;

    private String     description;

    public Article(int id, String name, double price, String desc) {
        this.ID = id;
        this.name = name;
        this.price = price;
        this.description = desc;

        Article.counter++;
    }

    public Article() {

        Article.counter++;
    }

    public Article(String descriptor) throws BadArticleIDException, DescriptorParseError {
    	String[] properties = descriptor.split(":");
    	
    	if(properties.length != 4) {
    		DescriptorParseError e = new DescriptorParseError();
    		throw e;
    	}
    	
    	this.ID = Integer.valueOf(properties[0]);
    	
    	if(this.ID < 0) {
    		BadArticleIDException e = new BadArticleIDException(ID);
    		throw e;
    	} else if(this.ID <= Article.counter) {
    		ExistingIDException e = new ExistingIDException(ID);
    		throw e;
    	}
    	
    	this.name = properties[1];
    	this.price = Double.valueOf(properties[2]);
    	this.description = properties[3];
    	
    	Article.counter++;
    }
    
    public static Article getInstance(String descriptor) throws BadArticleIDException, DescriptorParseError {

    	Scanner scanner = new Scanner(descriptor);
    	scanner.useDelimiter(":");

    	Article instance = new Article(); //Article.counter tu jest zwiekszany!

    	instance.ID = scanner.nextInt();
    	
    	if(instance.ID < Article.counter) {
    		ExistingIDException e = new ExistingIDException(instance.ID);
    		scanner.close();
    		
    		throw e;
    	}
    	
    	instance.name = scanner.next();
    	instance.price = Double.valueOf(scanner.next());
    	instance.description = scanner.next();
    	
    	scanner.close();
    	
    	return instance;
    }
    
    protected void printChange() {
        System.out.println("Zmieniono wartoœæ pola");
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;

        printChange();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

        printChange();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

        printChange();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

        printChange();
    }

    @Override
    public String toString() {
        return "Article " + Article.counter + ": [ID=" + ID + ", name=" + name + ", price=" + price + ", description="
                + description + "]";
    }

	public int getCounter() {
		return Article.counter;
	}

	public static void resetCounter() {
		Article.counter = 0;
	}
}
