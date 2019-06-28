import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main (String[] args) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("src/RandomAccessFileTest.java", "r");
            System.out.println("RandomAccessFile的文件指针的初始位置：" + raf.getFilePointer());
            raf.seek(300);
            byte[] buf = new byte[1024];
            int hasRead = 0;
            while ((hasRead = raf.read(buf)) > 0) {
                System.out.println(new String(buf, 0, hasRead));
            }
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            }catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
