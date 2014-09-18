import java.io.File;


public class DeleteFile {
	// ------------ 		Удаление файла 		---------------------------
	public void delete(File file){
		
		if(!file.exists())fail("Такого файла нет!");
		if(!file.canWrite())fail("Файл защещен!");
		if(file.isDirectory()){
			String[] files = file.list();
			if(files.length>0)fail("Каталог удалить нельзя потому, что каталог не пуст!");
		}
	 boolean cusses = file.delete();
	 if(cusses)System.out.println("Файл удален");
	}
	
	public void delete(String filename){
		delete(new File(filename));	
	}
	
	private void fail(String msg) throws  IllegalArgumentException {
		throw new IllegalArgumentException(msg);
	}
}
