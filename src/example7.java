import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example7 {
    public static void main (String[] args) {
        BufferedReader br = null;
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            br = new BufferedReader(reader);
            String buff = null;
            while ((buff = br.readLine()) != null){
                if(buff.equals("exit")) {
                    System.exit(0);
                }
                System.out.println("输入内容：" +buff);
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
