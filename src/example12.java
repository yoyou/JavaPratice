import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class example12 {
    public static void main (String[] args) {
        PrintStream ps = null;
        try {
            Process p = Runtime.getRuntime().exec("java ReadStandard");
            ps = new PrintStream(p.getOutputStream());
            ps.println("普通字符串");
            ps.println(new example12());
        }catch (IOException ioe){
            ioe.printStackTrace();
        }finally {
            if (ps != null) {
                ps.close();
            }
        }
    }
}

class ReadStandard {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            PrintStream ps = new PrintStream(
                    new FileOutputStream("out.txt")
            );
            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                ps.println("键盘输入的内容：" + sc.next());
            }
            ps.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}