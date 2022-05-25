import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.util.ArrayList;

public class testPath {


    // adapted from: https://www.geeksforgeeks.org/files-class-readstring-method-in-java-with-examples/
    public static void main(String[] args)
        {
            // creating path
            Path fileName
                = Paths.get("test-file.md");

                System.out.println(fileName.toAbsolutePath());

                System.out.println(fileName);
                //System.out.println(folder);
            try
      
            {
                // reading file from given path
                String content = Files.readString(fileName);
                // printing the content
                System.out.println(content);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    
}
