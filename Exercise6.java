package exercise6;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Exercise6 {

    public static ArrayList<String> replaceRepetitive(String input) {
        
        String [] array = input.split("\\s");
        ArrayList<String> s = new ArrayList<String>(Arrays.asList(array));
        for (int a = 0; a < s.size() - 1; a++){
            if(s.size() > 1){
            int j = a +1;
            String p="";           
            while(j<s.size() && s.get(a).equals(s.get(j))){
                p = s.get(j);                
                s.remove(j);                
            }
            
            if (p != "") {                
                s.set(a, "REPEAT");                
            }
            }            
        }
        return s;
    }
    
    public static void check(String input, String expect, int numberOfCase){
        ArrayList<String> rs = replaceRepetitive(input);
        System.out.println("Case "+numberOfCase+": "+input);
        System.out.println("Expect output: "+expect);
        System.out.print("Real output: ");
        for (String str:rs){
            System.out.print(str+" ");
        }
        System.out.println("");
        System.out.println("==============================");
    }
    public static void main(String[] args) {
        check("I want to to go to the the the zoo ","I want REPEAT go to REPEAT zoo",1);
        check("i need need coffe coffe ","i REPEAT REPEAT  ",2);
        check("i have have  aa dream dream  "," i REPEAT aa REPEAT   ",3);
    }
    
}