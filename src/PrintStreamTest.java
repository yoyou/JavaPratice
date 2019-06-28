import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main (String[] args) {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File(".").getAbsoluteFile().getParent() + "/src/example3.java");
            ps = new PrintStream(fos);
            ps.println("普通字符串");
            ps.println(new PrintStreamTest());
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }finally {
            if(ps != null) {
                ps.close();
            }
        }
    }
}
