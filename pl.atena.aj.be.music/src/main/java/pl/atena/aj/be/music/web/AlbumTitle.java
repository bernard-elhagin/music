package pl.atena.aj.be.music.web;

import java.io.Serializable;

public class AlbumTitle implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -7223245430912857927L;

	private String title;

	public AlbumTitle(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
