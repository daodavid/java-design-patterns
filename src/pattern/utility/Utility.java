package pattern.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utility {
    /**
     * Reads file content
     * @param filePath
     * @return
     */
    public static String getFileContent(String filePath) {
        FileReader fr = null;
        char[] buffer = new char[1024];
        StringBuffer fileContent = new StringBuffer();
        try {
            fr = new FileReader(filePath);
            int i = 0;
            while ((i = fr.read(buffer)) != -1) {
                fileContent.append(new String(buffer));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return fileContent.toString();
    }

}
