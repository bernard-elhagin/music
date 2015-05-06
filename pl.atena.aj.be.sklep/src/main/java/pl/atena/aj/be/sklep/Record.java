package pl.atena.aj.be.sklep;

import pl.atena.aj.be.utils.Streamable;
import pl.atena.aj.be.utils.FileType;

public class Record extends Article implements Streamable {

	private double fileSize;
	private FileType fileType;
	
	public Record(FileType ft, double size) {
		this.fileType = ft;
		this.fileSize = size;
	}

	public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType ft) {
        this.fileType = ft;
    }

    public byte[] nextPacket() {
		return null;
	}
	
    @Override
    public String toString() {
        return super.toString() + "\n" + "Record [fileSize=" + fileSize + ", fileType=" + fileType + "]";
    }
}
