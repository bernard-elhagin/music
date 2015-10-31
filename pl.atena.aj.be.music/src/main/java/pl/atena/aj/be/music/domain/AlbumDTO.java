package pl.atena.aj.be.music.domain;

import java.io.Serializable;
import java.util.List;

public class AlbumDTO implements Serializable {

	private static final long serialVersionUID = 4546300624947746982L;
	
	/* ID albumu w bazie */
	private int albumId;
	
	/* Tytu³ albumu */
	private String title;
	
	/* Wykonawca */
	private ArtistDTO artist;

	/* Gatunek albumu */
	private GenreDTO genre;
	
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

	public GenreDTO getGenre() {
		return genre;
	}

	public void setGenre(GenreDTO genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "AlbumDTO [albumId=" + albumId + ", title=" + title + ", artist=" + artist + ", genre=" + genre
				+ ", tracks=" + tracks + "]";
	}
}