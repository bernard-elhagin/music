package pl.atena.aj.be.music.domain;

import java.io.Serializable;
import java.util.List;

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
	
	/* Utwory */
	private List<TrackDTO> tracks;
	
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

	public List<TrackDTO> getTracks() {
		return tracks;
	}

	public void setTracks(List<TrackDTO> tracks) {
		this.tracks = tracks;
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
				+ ", year=" + year + ", tracks=" + tracks + "]";
	}
}