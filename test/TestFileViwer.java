import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;


public class TestFileViwer {

	@Test
	public void showTest(){
		FileViewer fv = new FileViewer();
		String q = fv.show(null, "testf.txt");
		System.out.println(q);
	}
}
