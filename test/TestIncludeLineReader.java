import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;


public class TestIncludeLineReader {

	@Test
		public void testIncludeLineReader(){
		IncludeLineReader in = null;
		try {
			in = new IncludeLineReader(new FileReader("testf.txt"),"kk");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line;
		try {
			while((line=in.readLine())!=null)System.out.println(line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
