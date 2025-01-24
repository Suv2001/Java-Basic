//remove extra space from  String 

import java.util.*;
public class Q28 {
    public static void main(String[] args) {
        String str = "  Hello         world  ";
        
        // Remove extra spaces using regular expressions
        str = str.replaceAll("\\s+", " ").trim();
        
        System.out.println(str);
    }
    
}
