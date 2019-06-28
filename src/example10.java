import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example10 {
    public static void main (String[] args) {
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec("javac");
            br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String buf =null;
            while ((buf = br.readLine()) != null) {
                System.out.println(buf);
            }
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            }catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
