package pl.atena.aj.be.music.domain;

import java.io.Serializable;

public class AlbumDTO implements Serializable {

	private static final long serialVersionUID = 4546300624947746982L;
	
	/* ID albumu w bazie */
	private int albumId;
	
	/* Tytuł albumu */
	private String title;
	
	/* Wykonawca */
	private ArtistDTO artist;

	/* Gatunek albumu */
	private Genre genre;
	
	/* Rok wydania */
	private int year;
	
	public AlbumDTO() {	}
	
	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArtistDTO getArtist() {
		return artist;
	}

	public void setArtist(ArtistDTO artist) {
		this.artist = artist;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "AlbumDTO [albumId=" + albumId + ", title=" + title + ", artist=" + artist + ", genre=" + genre
				+ ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + albumId;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlbumDTO other = (AlbumDTO) obj;
		if (albumId != other.albumId)
			return false;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (genre != other.genre)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
}