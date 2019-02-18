package Chapter19;
import java.lang.reflect.Array;
import java.util.*;
import java.io.File;
public class CountKeywords {
    public static void main(String[] args) throws java.io.FileNotFoundException{
        Scanner input = new Scanner(System.in);
        System.out.print("enter a java source file:");
        String filename = input.nextLine();
        File file = new File(filename);
        if(file.exists()){
            System.out.println("the number of keywords in " + filename + " is " + countKeywords(file));
        }
    }
    public static int countKeywords(File file) throws java.io.FileNotFoundException{
        String[] keyWordString = {"abstract","assert","boolean","break","byte","case",
                                  "catch","char","class","const","continue","default",
                                  "do","double","else","enum","extends","for","final",
                                  "float","goto","if","implements","import","instanceof",
                                  "int","interface","long","native","new","package","private",
                                  "protected","public","return","short","static","stricfp",
                                  "super","switch","synchronized","this","throw","throws",
                                  "transient","try","void","volatile","while","true","false",
                                  "null"};
        Set<String> keywordSet = new HashSet<>(Arrays.asList(keyWordString));//change array to list
        int count = 0;
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String word = input.next();
            if(keywordSet.contains(word))
                count++;
        }
        return count;
    }
}
