import java.io.File;
import java.io.FilenameFilter;

public class example2 {
    public static void main (String[] args) {
        File file = new File(".");
        String[] nameList = file.list(new MyFilenameFilter());
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}

class MyFilenameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        if (name.startsWith(".")) {
            return true;
        }
        return false;
    }
}