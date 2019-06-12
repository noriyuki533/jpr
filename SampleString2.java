import java.io.*;

public class SampleString2{
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
    
    public static void main(String[] args){
	String text = inputString();
	for(int i=0;i<text.length();i++)System.out.println(text.charAt(i));
    }
    
    
    
}
