import java.io.File;


public class DeleteFile {
	// ------------ 		�������� ����� 		---------------------------
	public void delete(File file){
		
		if(!file.exists())fail("������ ����� ���!");
		if(!file.canWrite())fail("���� �������!");
		if(file.isDirectory()){
			String[] files = file.list();
			if(files.length>0)fail("������� ������� ������ ������, ��� ������� �� ����!");
		}
	 boolean cusses = file.delete();
	 if(cusses)System.out.println("���� ������");
	}
	
	public void delete(String filename){
		delete(new File(filename));	
	}
	
	private void fail(String msg) throws  IllegalArgumentException {
		throw new IllegalArgumentException(msg);
	}
}
