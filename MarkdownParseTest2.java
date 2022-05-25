import static org.junit.Assert.*;       // imports Assert
import org.junit.*;                     // imports JUnit
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest2 {

    
        @Test                               // tells Java that the following method will be a test
        public void addition() {            // method header
            assertEquals(2, 1 + 1);         // checks between the expected and actual output
        }


        @Test
    public void testSnipper1() throws IOException{
        ArrayList<String> links = MarkdownParse.getLinks(Files.readString(Path.of("snippet1.md")));
        ArrayList<String> exp = new ArrayList<String>();
        exp.add("`www.google.com");
        exp.add("google.com");
        exp.add("ucsd.edu");
        assertEquals(exp, links);
    }

    @Test
    public void testSnipper2() throws IOException{
        ArrayList<String> links = MarkdownParse.getLinks(Files.readString(Path.of("snippet2.md")));
        ArrayList<String> exp = new ArrayList<String>();
        exp.add("a.com");
        exp.add("a.com(())");
        exp.add("example.com");
        assertEquals(exp, links);
    }

    @Test
    public void testSnipper3() throws IOException{
        ArrayList<String> links = MarkdownParse.getLinks(Files.readString(Path.of("snippet3.md")));
        ArrayList<String> exp = new ArrayList<String>();
        exp.add("https://www.twitter.com");
        exp.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        exp.add("https://cse.ucsd.edu/");
        assertEquals(exp, links);
    }
    
}
