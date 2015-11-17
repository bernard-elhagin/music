package pl.atena.aj.be.music.domain;

import java.io.Serializable;

public class ArtistDTO implements Serializable {
	
	private static final long serialVersionUID = -8764908227192375066L;

	/* ID wykonawcy w bazie */
	private int artistId;
	
	/* Nazwa wykonawcy */
	private String name;

	public ArtistDTO() { }
	
	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ArtistDTO [artistId=" + artistId + ", name=" + name + "]";
	}
}