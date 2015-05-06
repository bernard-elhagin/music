package pl.atena.aj.be.sklep;

import org.junit.Test;

import pl.atena.aj.be.utils.FileType;
import static org.assertj.core.api.Assertions.assertThat;

public class RecordTest {

	@Test
	public void testRecordConstructor1() {
		Record rec = new Record(FileType.AVI, 150.00);
		
		assertThat(rec.getFileType()).isEqualTo(FileType.AVI);
	}
	
	@Test
	public void testRecordConstructor() {
		Record rec = new Record(FileType.AVI, 150.00);
		
		assertThat(rec.getFileSize()).isEqualTo(150.00);
	}
}
