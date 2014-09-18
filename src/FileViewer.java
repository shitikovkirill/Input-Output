import java.io.File;
import java.io.FileReader;
import java.io.IOException;




public class FileViewer {
	private String directory,	filename;
	
	public String show(File file){
		String s = null;
		FileReader in = null;
		try {
			in = new FileReader(file);
			char[] buffer = new char[4096];
			int len;
			while((len = in.read(buffer)) != - 1) {
				s = new String(buffer, 0, len);
			}
		} catch (IOException e) {
		}finally { 
		try { if (in!=null) in.close(); 
			} catch (IOException ex) {} 
		}
		return s;

	}
	
	public String show (String directory, String filename){
		

		if (directory == null) {
			File f;
			if ((filename != null) && (f = new File(filename)).isAbsolute()) {
					directory = f.getParent();
					filename = f.getName();
			}
			} else {
				directory = System.getProperty("user.dir");
			}
			this.directory = directory;


			if ((filename == null) || (filename.length() == 0)) return null;
			File file = new File(directory, filename);
			
			return show(file);
			
	}
	}
