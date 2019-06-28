import java.io.IOException;
import java.io.StringReader;

public class example6 {
    public static void main(String[] args) {
        String src = "这人间袅袅炊烟\n" +
                "和风花雪月浪漫\n" +
                "痴情人多半贪恋\n" +
                "爱恨情仇的好看\n" +
                "又让你痛不欲生\n" +
                "又让你趁醉装疯\n" +
                "终有天脱胎换骨\n" +
                "直到哭着笑才懂\n" +
                "欲问青天这人生";
        StringReader sb = new StringReader(src);
        char[] buffer = new char[32];
        int hasReader = 0;
        try {
            while ((hasReader = sb.read(buffer)) >0 ) {
                System.out.println(new String(buffer, 0, hasReader));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(sb != null) {
                sb.close();
            }
        }
    }
}
