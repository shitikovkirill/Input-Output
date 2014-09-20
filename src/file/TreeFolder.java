package file;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;


public class TreeFolder {
	
	ArrayList<MyFile> arl = new <MyFile> ArrayList();
	
	public ArrayList<MyFile> sortList(){
		
		return arl;
	}

	public ArrayList<MyFile>  listFiles (File file){
	
	arl.add(addMyFile(file));
	
	if(file.isDirectory()){
		
		String [] list = file.list();
	
	for(int i=0;i<list.length;i++){
		
		File newFile = new File(file, list[i]);
		if(newFile.isDirectory())	listFiles(newFile);
		else if(newFile.isFile()) 	arl.add(addMyFile(newFile));
	}
	}
		return arl;
	}



private MyFile addMyFile(File file){
	return new MyFile(
			file.getName(),
			file.length(), 
			new Date(file.lastModified())
			);
}

	public class MyFile implements Comparable<MyFile>{
		private String name;
		private long size;
		private Date date;
		public MyFile(String name, long size, Date date ){
			this.name=name;
			this.size=size;
			this.date=date;
		}
		
		public int compareTo(MyFile myFile) {
		    int result = name.compareTo(myFile.name);
		    return result;
		  }
		
		public String getName(){
			return name;
		}
		public long getSize(){
			return size;
		}
		public Date getDate(){
			return date;
		}
		
		public String toString(){
			return "File " +name+" Size "+size+" Date " +date;
		}
	}
	
	
}
