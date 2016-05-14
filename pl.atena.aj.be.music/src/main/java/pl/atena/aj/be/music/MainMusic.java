package pl.atena.aj.be.music;

import de.umass.lastfm.Album;
import de.umass.lastfm.Track;

public class MainMusic {

	public static void main(String[] args) throws Exception {
		String apiKey = "757d3b9331c25020e4b691cc8a2c1b03";

		for(Track trck : Album.getInfo("Led Zeppelin", "II", apiKey).getTracks()) {
			System.out.println(trck.getName());
		}
	}
}