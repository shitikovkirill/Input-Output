package file;


import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import file.DeleteFile;

public class TestDeleteFile {
	DeleteFile delete = new DeleteFile();

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
		delete.delete("testfil.txt");
		assertFalse(file.exists());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void deleteExeptionNoFileTest(){
		delete.delete("t");
	}

}
