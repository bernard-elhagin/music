package pl.atena.aj.be.music.web.rest;

public class Artist {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Artist [name=" + name + "]";
    }
}
