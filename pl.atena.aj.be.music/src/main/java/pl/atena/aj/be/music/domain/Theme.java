package pl.atena.aj.be.music.domain;

import java.io.Serializable;

public class Theme implements Serializable {

	private static final long serialVersionUID = 20141005L;

	private String displayName;
	private String name;

	public Theme(String displayName, String name) {
		this.displayName = displayName;
		this.name = name;
	}

	public final String getDisplayName() {
		return displayName;
	}

	public String getName() {
		return name;
	}
}