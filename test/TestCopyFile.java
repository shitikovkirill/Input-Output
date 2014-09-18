import static org.junit.Assert.*;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

import org.junit.Test;


public class TestCopyFile {
	CopyFile copy = new CopyFile();
	@Test
	public void copyTest() {
		File file = new File("copyfile1.txt");
		try {
			file.createNewFile();
			copy.copy("copyfile1.txt", "copyfile2.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file2 = new File("copyfile2.txt");
		assertTrue(file2.exists());
		if (file.exists()) file.delete();
		if (file2.exists()) file2.delete();
	}

	@Test
	public void copyInDirTest() throws IOException {
		File file = new File("indir.txt");
		file.createNewFile();
		
		copy.copy("indir.txt", "test");
		File file2 = new File("test//copyindir.txt");
		assertTrue(file2.exists());
		if (file.exists()) file.delete();
		if (file2.exists()) file2.delete();
	}
	
	@Test (expected = IOException.class)
	public void copyCatalogExeptionTest() throws IOException {

			copy.copy("bin", "to_name");
	
	}
}
