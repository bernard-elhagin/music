package pl.atena.aj.be.sklep;

import pl.atena.aj.be.utils.BadArticleIDException;
import pl.atena.aj.be.utils.DescriptorParseError;

public class Main {

	public static void main(String[] args) throws BadArticleIDException, DescriptorParseError {
		Article art = new Article("4:rower:56.99:fajny rower");
		
		System.out.println(art.toString());
	}
}
