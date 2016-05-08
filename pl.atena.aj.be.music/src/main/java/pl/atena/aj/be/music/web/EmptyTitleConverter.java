package pl.atena.aj.be.music.web;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import pl.atena.aj.be.music.domain.AlbumTitle;

@FacesConverter("EmptyTitleConverter")
public class EmptyTitleConverter implements Converter {

	private static final String EMPTY_TITLE = "(Untitled)";

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {

		AlbumTitle title = null;

		// Jeśli pusty tytuł, użyj defaulta
		if(value.isEmpty()) {
			value = EMPTY_TITLE;
		}

		try {
			title = new AlbumTitle(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
	        throw new ConverterException("Error converting title.");
		}

		return title;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {

		return value.toString();
	}
}
