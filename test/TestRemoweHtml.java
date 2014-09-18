import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;


public class TestRemoweHtml {

	@Test 
	public void filtrTest(){
	
	BufferedReader in = null;
	try {
		in = new BufferedReader(new RemoweHtmlReader(new FileReader("testf.txt")));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String line;
	try {
		while((line =in.readLine())!=null)
		System.out.println(line);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		in.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
