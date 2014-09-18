import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class CopyFile {
	
public void copy(String from_name, String to_name) throws  IOException{
	File from_file = new File(from_name);
	File to_file = new File(to_name);
	
	if(!from_file.exists()) abort ("Такого файла нет");
	if(!from_file.isFile()) abort ("Невозможно копирование каталога "+ from_name);
	if(!from_file.canRead()) abort ("Исходний файл не доступен для чтения " + from_name);
	
	if(to_file.isDirectory()){
		to_file = new File(to_name, "copy"+from_file.getName());
		System.out.println("--to "+to_name +"  --from "+from_file);
	}
	
	if(to_file.exists()){
		if (!to_file.canWrite()) abort( "конечный файл не доступен для записи! " + to_name);
	} 
	
	FileInputStream from = null; 
	FileOutputStream to = null;
	try{
		from =new FileInputStream(from_file);
		to = new FileOutputStream(to_file);
		byte[] buffer = new byte[4096];
		int bytes_read;
		while((bytes_read=from.read(buffer))!=-1){
			to.write(buffer, 0, bytes_read);
		}
	} finally {
		if (from != null){
			try {
				from.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(to!=null){
			try {
				to.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public void abort(String msg) throws  IOException {
	 throw new IOException(msg);
}
}
