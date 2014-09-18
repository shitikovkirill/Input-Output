package filter;
import java.io.File;
import java.io.FilenameFilter;

public class OnlyWith implements FilenameFilter{
	String filter;
	public OnlyWith(String filter){
	 this.filter ="."+ filter;
	}
	
	public boolean accept (File dir, String name){
	return name.endsWith(filter);
	}
}