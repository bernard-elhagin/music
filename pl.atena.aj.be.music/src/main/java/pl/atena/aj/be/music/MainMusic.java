package pl.atena.aj.be.music;

import java.util.List;

import javax.faces.model.SelectItem;

import pl.atena.aj.be.music.domain.Genre;

public class MainMusic {

	public static void main(String[] args) throws Exception {

		List<SelectItem> si = Genre.getAllValues();

		System.out.println(si.toString());
	}
}