import java.io.File;
import java.io.FileReader;
import java.io.IOException;




public class FileViewer {
	private String directory;
	
	public String show(File file){
		StringBuffer s = new StringBuffer();
		FileReader in = null;
		try {
			in = new FileReader(file);
			char[] buffer = new char[4096];
			int len;
			while((len = in.read(buffer)) != - 1) {
				s.append(new String(buffer, 0, len));
			}
		} catch (IOException e) {
		}finally { 
		try { if (in!=null) in.close(); 
			} catch (IOException ex) {} 
		}
		
		return s.toString();

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
