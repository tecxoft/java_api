import java.io.FileOutputStream;
import com.tecxoft.tips.api.TIPSSignRequest;

public class SignRequest {
    public static void main(String args[]){
    	try{
		    // initialize the class with userId and password
	    	TIPSSignRequest request = new TIPSSignRequest("224488", "password"); 
	    	// signed PDF file data received in byte array
			byte[] data = request.sendSignRequest("C:/folder/testFile.pdf");
			// choose to write the file to file system
			FileOutputStream fileOutputStream = null;
			fileOutputStream = new FileOutputStream("C:/folder/file"+System.currentTimeMillis()+"-java"+".pdf");
			fileOutputStream.write(data);
			fileOutputStream.close();
			System.out.println("File written.");
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
    }
}
