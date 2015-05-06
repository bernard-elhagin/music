package pl.atena.aj.be.sklep;

import pl.atena.aj.be.utils.Downloadable;
import pl.atena.aj.be.utils.FileType;

public class DownloadableObject implements Downloadable {

	private double fileSize;
	private FileType fileType;
	
	public double getFileSize() {
		return fileSize;
	}

	public FileType getFileType() {
		return fileType;
	}

}
