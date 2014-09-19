package file;


import java.io.File;

public class SizeFolderAndFile {
	

	private long sizeFile(File file){
		long size = file.length();
		return size;
	}
	
	private long sizeFolder(File file){
		long size = 0;
		if(file.isDirectory()){
				String [] listFile;
				listFile= file.list();
		try{
				for(int i =0;i<listFile.length;i++){
			
					File newFile = new File(file, listFile[i]);
					size += sizeFolder(newFile);
					
				}
		}catch (NullPointerException e){
			return 0;
		}
		}else if(file.isFile()){
			size = sizeFile(file);
			return size;
		}
		
		
		return size;
	}
	
	public long size(File file){
		long size = 0;
		size = sizeFolder(file);
		return size;
	}
	
}
