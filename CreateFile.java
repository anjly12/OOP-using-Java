package OOPJava;
import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String[]args) {
		try {
			File myOb=new File("filename.txt");
			if(myOb.createNewFile()) {
				System.out.println("File Created:"+myOb.getName());
			}else {
				System.out.println("File already exists:");
			}
		}catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}