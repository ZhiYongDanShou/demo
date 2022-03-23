package lab14.work;

import java.io.File;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2021-11-30 {TIME}
 */
public class MyTest04 {
    public static void createFile() {
        File file = new File("src/lab14/work/b.txt");
        if (!file.exists())
            try {
                file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        createFile();
    }
}
