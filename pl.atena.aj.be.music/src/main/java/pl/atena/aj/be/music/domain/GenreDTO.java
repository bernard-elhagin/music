package pl.atena.aj.be.music.domain;

import java.io.Serializable;

public class GenreDTO implements Serializable {

	private static final long serialVersionUID = -1584114414086368849L;

	/* ID gatunku w bazie */
	private int genreId;
	
	/* Nazwa gatunku */
	private String name;

	public GenreDTO() { }
	
	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Genre [genreId=" + genreId + ", name=" + name + "]";
	}
}