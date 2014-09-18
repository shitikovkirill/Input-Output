import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class RemoweHtmlReader extends FilterReader{
	public RemoweHtmlReader(Reader in){
		super(in);
	}

	boolean intag = false;
	
	public int read() throws IOException {
		char[] buf = new char[1];
		int result = read(buf,0,1);
		if (result == -1) return -1;
		else return (int)buf[0];
	
	}
	
	public int read (char[] buf, int from, int len) throws IOException{
		int numchars=0;
		while (numchars==0){
			numchars=in.read(buf , from, len);
			if ( numchars==-1) return -1;
			int last = from;
			for(int i = from; i<from+numchars; i++){
				if(!intag){
					if(buf [i]=='<') intag =true;
					else buf[last++] = buf[i];
				} else if(buf[i]=='>') intag = false;
			}
			numchars=last - from;
		}
		return numchars;
	}
}