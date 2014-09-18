import static org.junit.Assert.*;

import org.junit.Test;


public class TestCompress {

	@Test
	public void archivesTest(){
		Compress com = new Compress();
		com.archives("testf.txt");
	}
	@Test
	public void archivesDirTest(){
		Compress com = new Compress();
		com.archives("test");
	}
}
