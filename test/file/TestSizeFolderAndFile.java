package file;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class TestSizeFolderAndFile {

	@Test
	public void test() {
		SizeFolderAndFile sizeF = new SizeFolderAndFile();
		System.out.print(sizeF.size(new File("1")));
	}

}
