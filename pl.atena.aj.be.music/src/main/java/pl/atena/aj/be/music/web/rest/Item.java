package pl.atena.aj.be.music.web.rest;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Item {

    protected String name;
    protected int id;

    public Item() {
        super();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", id=" + id + "]";
	}
}