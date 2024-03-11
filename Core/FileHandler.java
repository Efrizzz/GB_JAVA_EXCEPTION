package Core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public void writeToOutputFile(File file, String data) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
