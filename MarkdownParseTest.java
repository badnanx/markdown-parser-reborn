import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
import java.util.*; 


public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }  

    @Test 
    public void testFile() throws IOException{
        //     List<String> expected = Arrays.asList("https://something.com", "some-thing.html"); 
        
        //     // creating path
        //     Path fileName
        //     = Paths.get("test-file.md");

        //     System.out.println(fileName.toAbsolutePath());

        //     System.out.println(fileName);
        //     //System.out.println(folder);
        // try
  
        // {
        //     // reading file from given path
        //     String content = Files.readString(fileName);
        //     // printing the content
        //     System.out.println(content);
            
        //     ArrayList<String> links = MarkdownParse.getLinks(content);
        //     assertEquals(expected, links);
        // }
        // catch (IOException e) {
        //     e.printStackTrace();
        // }

        // l
        // System.out.println("mars");
        // Path pathes = Path.of("test-file.md");
        // System.out.println("hello");
        // System.out.println(pathes);
        // String contents = Files.readString(pathes);

        
        // List<String> expected = List.of("https://something.com", "some-page.html");
        // List<String> actual = MarkdownParse.getLinks(contents);

        // assertEquals(expected, actual);

        //d
        Path fileName = Path.of("C:/Users/16199/Desktop/markdown-parse-copy/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        //ArrayList<String> expected = new ArrayList<>();

        List<String> expected = Arrays.asList("https://something.com", "some-thing.html");
        // expected.add("https://something.com");
        // expected.add("some-thing.html");

        assertEquals(expected, links );

    }

    @Test 
    public void testFile1() throws IOException{
        
        Path fileName = Path.of("C:/Users/16199/Desktop/markdown-parse-copy/test-file1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://google.com");
        expected.add("https://bing.com");

        assertEquals(expected, links );
            
        
            

    }

    @Test 
    public void testFile2() throws IOException{
        Path fileName = Path.of("C:/Users/16199/Desktop/markdown-parse-copy/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        // ArrayList<String> expected = new ArrayList<>();
        // expected.add("https://google.com");
        // expected.add("https://bing.com");
        List<String> expected = Arrays.asList();

        assertEquals(expected, links );

    }

    @Test 
    public void testFile3() throws IOException{

        Path fileName = Path.of("C:/Users/16199/Desktop/markdown-parse-copy/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, links );            

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

    // @Test 
    // public void testLinks() {
    //     assertEquals("[https://something.com, some-thing.html]", );
    // }
    

    //Files.readString(Path, Charset);


    //Path filePath = Path.of("C:\Users\16199\Desktop\cse15\markdown-parser\test-file.md");

    //String content = Files.readString(filePath);

    //Files.readString(filePath);

    

    


/*public static void main(String[] args)
        {
            // creating path
            Path filePath
                = Paths.get("C:/Users/16199/Desktop/cse15/markdown-parser/test-file.md");
            try
      
            {
                // reading file from given path
                String content = Files.readString(filePath);
                // printing the content
                System.out.println(content);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
