package pl.atena.aj.be.music.domain;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

/**
 * Oficjalna lista gatunków dla standardu ID3 v2.3.0.
 *
 * http://id3.org/id3v2.3.0
 *
 */
public enum Genre {

	A_CAPELLA("A capella"),
	ACID("Acid"),
	ACID_JAZZ("Acid Jazz"),
	ACID_PUNK("Acid Punk"),
	ACOUSTIC("Acoustic"),
	ALTERNATIVE("Alternative"),
	ALTERNROCK("AlternRock"),
	AMBIENT("Ambient"),
	AVANTGARDE("Avantgarde"),
	BALLAD("Ballad"),
	BASS("Bass"),
	BEBOP("Be bop"),
	BIG_BAND("Big Band"),
	BLUEGRASS("Bluegrass"),
	BLUES("Blues"),
	BOOTY_BASS("Booty Bass"),
	CABARET("Cabaret"),
	CELTIC("Celtic"),
	CHAMBER_MUSIC("Chamber Music"),
	CHANSON("Chanson"),
	CHORUS("Chorus"),
	CHRISTIAN_RAP("Christian Rap"),
	CLASSIC_ROCK("Classic Rock"),
	CLASSICAL("Classical"),
	CLUB("Club"),
	COMEDY("Comedy"),
	COUNTRY("Country"),
	CULT("Cult"),
	DANCE("Dance"),
	DANCE_HALL("Dance Hall"),
	DARKWAVE("Darkwave"),
	DEATH_METAL("Death Metal"),
	DISCO("Disco"),
	DREAM("Dream"),
	DRUM_SOLO("Drum Solo"),
	DUET("Duet"),
	EASY_LISTENING("Easy Listening"),
	ELECTRONIC("Electronic"),
	ETHNIC("Ethnic"),
	EURO_HOUSE("Euro-House"),
	EURO_TECHNO("Euro-Techno"),
	EURODANCE("Eurodance"),
	FAST_FUSION("Fast Fusion"),
	FOLK("Folk"),
	FOLK_ROCK("Folk-Rock"),
	FOLKLORE("Folklore"),
	FREESTYLE("Freestyle"),
	FUNK("Funk"),
	FUSION("Fusion"),
	GAME("Game"),
	GANGSTA("Gangsta"),
	GOSPEL("Gospel"),
	GOTHIC("Gothic"),
	GOTHIC_ROCK("Gothic Rock"),
	GRUNGE("Grunge"),
	HARD_ROCK("Hard Rock"),
	HIP_HOP("Hip-Hop"),
	HOUSE("House"),
	HUMOUR("Humour"),
	INDUSTRIAL("Industrial"),
	INSTRUMENTAL("Instrumental"),
	INSTRUMENTAL_POP("Instrumental Pop"),
	INSTRUMENTAL_ROCK("Instrumental Rock"),
	JAZZ("Jazz"),
	JAZZ_FUNK("Jazz+Funk"),
	JUNGLE("Jungle"),
	LATIN("Latin"),
	LO_FI("Lo-Fi"),
	MEDITATIVE("Meditative"),
	METAL("Metal"),
	MUSICAL("Musical"),
	NATIONAL_FOLK("National Folk"),
	NATIVE_AMERICAN("Native American"),
	NEW_AGE("New Age"),
	NEW_WAVE("New Wave"),
	NOISE("Noise"),
	OLDIES("Oldies"),
	OPERA("Opera"),
	OTHER("Other"),
	POLKA("Polka"),
	POP("Pop"),
	POP_FOLK("Pop-Folk"),
	POP_FUNK("Pop/Funk"),
	PORN_GROOVE("Porn Groove"),
	POWER_BALLAD("Power Ballad"),
	PRANKS("Pranks"),
	PRIMUS("Primus"),
	PROGRESSIVE_ROCK("Progressive Rock"),
	PSYCHADELIC("Psychadelic"),
	PSYCHEDELIC_ROCK("Psychedelic Rock"),
	PUNK("Punk"),
	PUNK_ROCK("Punk Rock"),
	R_B("R&B"),
	RAP("Rap"),
	RAVE("Rave"),
	REGGAE("Reggae"),
	RETRO("Retro"),
	REVIVAL("Revival"),
	RHYTHMIC_SOUL("Rhythmic Soul"),
	ROCK("Rock"),
	ROCK_ROLL("Rock & Roll"),
	SAMBA("Samba"),
	SATIRE("Satire"),
	SHOWTUNES("Showtunes"),
	SKA("Ska"),
	SLOW_JAM("Slow Jam"),
	SLOW_ROCK("Slow Rock"),
	SONATA("Sonata"),
	SOUL("Soul"),
	SOUND_CLIP("Sound Clip"),
	SOUNDTRACK("Soundtrack"),
	SOUTHERN_ROCK("Southern Rock"),
	SPACE("Space"),
	SPEECH("Speech"),
	SWING("Swing"),
	SYMPHONIC_ROCK("Symphonic Rock"),
	SYMPHONY("Symphony"),
	TANGO("Tango"),
	TECHNO("Techno"),
	TECHNO_INDUSTRIAL("Techno-Industrial"),
	TOP("Top 40"),
	TRAILER("Trailer"),
	TRANCE("Trance"),
	TRIBAL("Tribal"),
	TRIP_HOP("Trip-Hop"),
	VOCAL("Vocal");

	private String name;

	/* Na potrzeby JSF-owej listy rozwijanej */
	private static List<SelectItem> allValues = fillValues();

	private Genre(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static List<SelectItem> getAllValues() {
		return allValues;
	}

	public synchronized static List<SelectItem> fillValues() {

		/* Tworzymy listę tylko raz */
		if (allValues == null) {

			allValues = new ArrayList<>();

			for (Genre genre : Genre.values()) {
				SelectItem si = new SelectItem(genre, genre.name);

				allValues.add(si);
			}
		}

		return allValues;
	}
}