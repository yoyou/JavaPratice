import java.io.IOException;
import java.io.RandomAccessFile;

public class example13 {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("note.txt", "rw");
            raf.seek(raf.length());
            raf.write("追加内容".getBytes());
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
