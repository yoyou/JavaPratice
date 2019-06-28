// 文本编辑器

import java.io.File;

public class example1 {
    public static void main(String[] args) {
        File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile().getParent());
        try {
            File tmpFile = File.createTempFile("aaa", ".txt", file);
            tmpFile.deleteOnExit();
            File newFile = new File("" + System.currentTimeMillis());
            System.out.println( "newFile 文件对象是否存在" + newFile.exists());
            newFile.createNewFile();
            newFile.mkdir();
            String[] fileList = file.list();
            System.out.println("=======当前路径下的所有文件和路径如下============");
            for (String filename : fileList) {
                System.out.println(filename);
            }
            File[] roots = File.listRoots();
            System.out.println("=======系统所有根路径如下============");
            for (File root: roots) {
                System.out.println(root);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
