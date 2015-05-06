package pl.atena.aj.be.sklep;

public abstract class Person {
    private static int counter;

    private final int id;

    private String name;

    public Person() {
        this.id = Person.counter++;
    }

    public abstract boolean getAuthorization();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}