import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class example4 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File(".").getAbsoluteFile().getParent() + "/src/example3.java");
            fos = new FileOutputStream("newFile.txt");
            byte[] bytes = new byte[32];
            int hasRead = 0;
            while ((hasRead = fis.read(bytes)) > 0){
                fos.write(bytes,0 , hasRead);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fis !=null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }

}
