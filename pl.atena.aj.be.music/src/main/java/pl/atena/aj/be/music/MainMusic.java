package pl.atena.aj.be.music;

import java.text.DateFormat;
import java.util.Collection;

import de.umass.lastfm.Artist;
import de.umass.lastfm.Chart;
import de.umass.lastfm.User;

public class MainMusic {

	public static void main(String[] args) throws Exception {
		String apiKey = "757d3b9331c25020e4b691cc8a2c1b03";
		String user = "dev_null";

		Chart<Artist> chart = User.getWeeklyArtistChart(user, apiKey);
		DateFormat format = DateFormat.getDateInstance();

		String from = format.format(chart.getFrom());
		String to = format.format(chart.getTo());

		System.out.printf("Charts for %s for the week from %s to %s: %n", user, from, to);

		Collection<Artist> artists = chart.getEntries();
		for(Artist art : artists) {
			System.out.println(art.getName());
		}
	}
}