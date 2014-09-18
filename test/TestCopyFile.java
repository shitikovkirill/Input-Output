import static org.junit.Assert.*;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

import org.junit.Test;


public class TestCopyFile {
	CopyFile workwf = new CopyFile();
	@Test
	public void copyTest() {
		File file = new File("copyfile1.txt");
		try {
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			fw.write("Привет");
			workwf.copy("copyfile1.txt", "copyfile2.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file2 = new File("copyfile2.txt");
		assertTrue(file2.exists());
	}

}
