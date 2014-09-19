package file;
import static org.junit.Assert.*;

import org.junit.Test;

import file.FileLister;
import filter.OnlyWith;


public class TestFileLister {

	@Test
	public void listDirectoryTest(){
		FileLister fl = new FileLister("txt");
		String [] s = fl.listDirectory(null);
		for (int i = 0; i<s.length;i++){
			System.out.println(s[i]);
		}
	}
		
		@Test
		public void listDirectoryWithFilterTest(){
			FileLister fl = new FileLister(new OnlyWith("txt"));
			String [] s = fl.listDirectory(null);
			for (int i = 0; i<s.length;i++){
				System.out.println(s[i]);
			}
		
	}
	@Test
	public void fileInfoTest(){
		FileLister fl = new FileLister( );
	System.out.println(fl.fileInfo(null, "testf.txt"));
	}

}
