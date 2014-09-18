import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class IncludeLineReader extends BufferedReader{
	
	private String pattern;

	public IncludeLineReader(Reader in, String pattern){
		super(in);
		this.pattern = pattern;
	}
	
	public final String readLine() throws IOException{
	String line;
	do{
		line=super.readLine();
	} while((line !=null)&&line.indexOf(pattern)==-1);
	return line;
	}
}