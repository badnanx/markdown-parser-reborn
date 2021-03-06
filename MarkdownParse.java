//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);

           

            


            // changed so it now fixes error from test-file2, not just test-file1 and test-file3

            boolean isImage = false;

            if (openBracket > 0 && markdown.substring(openBracket-1, openBracket).equals("!")){
                isImage = true; 

            }




            // *************************************************

            // insert code 22.md fix here

            // **************************************************


            // **************************************************

            // insert code 41.md fix here

            // *************************************************
            
           

            if ((openBracket == -1 || openParen == -1 || closeParen == -1 || closeBracket == -1)){
                currentIndex = markdown.length(); 
            } else if (isImage) {
                currentIndex = closeParen + 1;

            // ***** insert an 'else if' for 22.md fix here  *****
                // Example: else if (invalidFirstChar) { currentIndex = closenParen + 1; }
                
                
            // ***** insert an 'else if' for 41.md fix here  *****
                // Example: else if (whiteSpace) { currentIndex = closenParen + 1; }

            } else {
                toReturn.add(markdown.substring(openParen + 1, closeParen));
                currentIndex = closeParen + 1;
            }

            
            // ***************************

            
            
           // toReturn.add(markdown.substring(openParen + 1, closeParen));        

           // currentIndex = closeParen + 1;
            
            
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);

        // print statement added for lab 4
        // System.out.println("greetings world!");
    }
}
