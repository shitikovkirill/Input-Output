package file;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.junit.Test;

import file.TreeFolder;
import file.TreeFolder.MyFile;

public class TestTreeFolder {

	@Test
	public void test() {
		TreeFolder sizeF = new TreeFolder();
		ArrayList<MyFile> arl =sizeF.listFiles(new File("1"));
		for(int i=0;i<arl.size(); i++) System.out.println(arl.get(i));
	}

}
