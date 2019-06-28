import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class example11 {
    public static void main (String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/example11.java");
            System.setIn(fis);
            Scanner sca = new Scanner(System.in);
            sca.useDelimiter("\n");
            while (sca.hasNext()){
                System.out.println("键盘输入的内容是：" + sca.next());
            }
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
