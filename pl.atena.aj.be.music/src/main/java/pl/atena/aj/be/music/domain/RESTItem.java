package pl.atena.aj.be.music.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RESTItem {

    protected String titleOrName;
    protected int id;

    public RESTItem() {
        super();
    }

    public String getTitleOrName() {
        return titleOrName;
    }

    public void setTitleOrName(String titleOrName) {
        this.titleOrName = titleOrName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item [titleOrName=" + titleOrName + ", id=" + id + "]";
    }
}