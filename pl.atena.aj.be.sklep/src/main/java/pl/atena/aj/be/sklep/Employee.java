package pl.atena.aj.be.sklep;

public class Employee extends Person {

    public Employee() {
    	super();
    }

    @Override
    public boolean getAuthorization() {
        return false;
    }

    @Override
    public String toString() {
        return "Employee [ID = " + getId() + "]";
    }
}