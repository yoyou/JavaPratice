import java.io.FileWriter;
import java.io.IOException;

public class example5 {
     public static void main(String[] args) throws IOException {
         FileWriter fw = null;
         try{
             fw = new FileWriter("poem.txt");
             fw.write("xxxxxxxxxxxxxxx");
             fw.write("aaaaaaaaaaaaaaa");
         }catch (Exception e) {
             e.printStackTrace();
         }finally {
             if (fw != null) {
                 fw.close();
             }
         }
     }
}
