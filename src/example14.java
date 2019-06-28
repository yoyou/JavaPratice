import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class example14 {
    public static void main (String[] args) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream( "object.txt"));
            Person per = new Person("x", 1);
            oos.writeObject(per);
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            }catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
