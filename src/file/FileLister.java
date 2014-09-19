package file;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileLister {
	
	private FilenameFilter filter;
	private SimpleDateFormat dateFormatter;

	public FileLister(){
		
	}
	
	public FileLister(final String filtersuffix){
	
		this.filter = new FilenameFilter(){

		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			if (name.endsWith(filtersuffix)) return true;
			else return (new File(dir, name).isDirectory());
		}
	};
	}
	public FileLister(FilenameFilter filter){
		this.filter=filter;
	}

public String[] listDirectory(String directory){
	if(directory == null)  directory = System.getProperty("user.dir");
	File dir = new File(directory);
	String[] files;
	if (!dir.isDirectory()) throw new IllegalArgumentException("нет такой директории");
	if(filter==null){
			files = dir.list();
	}else {
			files = dir.list(filter);
	}
	java.util.Arrays.sort(files);
	return files;
}

public String fileInfo(String currentDir, String filename) {
	if(currentDir==null) currentDir = System.getProperty("user.dir");
	File f = new File(currentDir, filename);
	if(!f.exists()) throw new IllegalArgumentException("нет такого файла или директории");
	String info ="File "+ filename+"\n";
	if(f.isDirectory()) info += File.separator;
	info+=" "+f.length()+" байт\n";
	Date date = new Date(f.lastModified());
	dateFormatter = new SimpleDateFormat();
	dateFormatter.format(date);
	info+= " Data " +date+ "\n";
	if (f.canRead()) info += " для чтения\n";
	if (f.canWrite()) info += " для записи";
	return info;
}
}
