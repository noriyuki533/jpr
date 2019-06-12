import java.util.*;
import java.io.*;

public class R09_1y18f1092{
    public static String inputString() {
	String s = "";
	try {
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    s = br.readLine();
	}
	catch(Exception e) {
	    System.out.println(e);
	    System.exit(1);
	}
	return s;
    }
	
    public static void main(String[] main){
	String text = inputString();
	char[] chars = text.toCharArray();
	for(int i = 0; i < text.length()-1; i++){
	    for(int j = 0; j < text.length()-1; j++){
		if(chars[j] > chars[j+1]){
		    char tmp = chars[j];
		    chars[j] = chars[j+1]; 
		    chars[j+1] = tmp;
		}
	    }
	}
	System.out.println(chars);
    }
    
}
