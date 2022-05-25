import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Linux/Mac
// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
// java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

// Windows
// javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
// java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest


public class MarkdownParseTest2 {
    
        // a sample test, the Junit equivalent of 'hello world'
        @Test                               
        public void addition() {           
            assertEquals(2, 1 + 1);         
        }


        @Test
    public void testSnippet1() throws IOException{   
             
        Path fileName = Path.of("C:/Users/16199/Desktop/cse15/markdown-parser-reborn/snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);        

        List<String> expected = Arrays.asList("url.com", "`google.com", "google.com", "ucsd.edu");
        System.out.println(expected);
        assertEquals(expected, links ); 

    }

    @Test
    public void testSnippet2() throws IOException{
        Path fileName = Path.of("C:/Users/16199/Desktop//cse15/markdown-parser-reborn/snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        List<String> expected = Arrays.asList("a.com", "a.com((", "example.com");
        System.out.println(expected);
        assertEquals(expected, links);        
        
    }

    @Test
    public void testSnippet3() throws IOException{
               Path fileName = Path.of("C:/Users/16199/Desktop/cse15/markdown-parser-reborn/snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println("Actual:\n" + links);

        List<String> expected = Arrays.asList("https://www.twitter.com", 
        "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", 
        "github.com And there's still some more text after that. [this link doesn't have a closing parenthesis for a while](https://cse.ucsd.edu/");
        System.out.println("Expected: \n" + expected);
        assertEquals(expected, links);
                
    }
    
}
