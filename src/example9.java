import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class example9 {
    public static void main (String[] args) {
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream("note.txt"));
            System.setOut(ps);
            System.out.println("普通字符串");
            System.out.println(new example9());
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ps != null) {
                ps.close();
            }
        }
    }
}
