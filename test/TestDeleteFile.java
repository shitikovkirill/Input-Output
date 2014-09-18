

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TestDeleteFile {
	DeleteFile workwf = new DeleteFile();

	@Test
	public void deleteTest() {
		File file = new File("testfil.txt");
		try {
			System.out.println("װאיכ סמחהאם "+file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(file.exists());
		workwf.delete("testfil.txt");
		assertFalse(file.exists());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void deleteExeptionNoFileTest(){
		workwf.delete("t");
	}

}
