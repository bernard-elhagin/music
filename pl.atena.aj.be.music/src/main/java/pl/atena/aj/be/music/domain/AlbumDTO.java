package pl.atena.aj.be.music.domain;

import java.io.Serializable;

public class AlbumDTO implements Serializable {

	private static final long serialVersionUID = 4546300624947746982L;
	
	/* ID albumu w bazie */
	private int albumId;
	
	/* Tytuł albumu */
	private String title;
	
	/* ID wykonawcy */
	private int artistId;

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

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	@Override
	public String toString() {
		return "AlbumDTO [albumId=" + albumId + ", title=" + title + ", artistId=" + artistId + ", genre=" + genre
				+ ", year=" + year + "]";
	}
}