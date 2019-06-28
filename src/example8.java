import java.io.*;

public class example8 {
    public static void main(String[] args) {
        PushbackReader pr = null;
        try {
            pr = new PushbackReader(new FileReader("src/example8.java"));
            char[] buf = new char[32];
            String lastContent = "";
            int hasRead = 0;
            while ((hasRead = pr.read(buf)) > 0) {
                String content = new String(buf, 0, hasRead);
                int targetIndex = 0;
                if ((targetIndex = (lastContent + content).indexOf("new PushbackReader")) > 0) {
                    pr.unread((lastContent + content).toCharArray());
                    pr.read(buf, 0 , targetIndex);
                    System.out.println(new String(buf, 0, targetIndex));
                    System.exit(0);
                }else {
                    System.out.println(lastContent);
                    lastContent = content;
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pr != null) {
                    pr.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
