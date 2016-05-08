package pl.atena.aj.be.music.web.rest;

public class Album extends Item {

	private String id;

	private String title;

    public Album() {
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", title=" + title + "]";
	}
}