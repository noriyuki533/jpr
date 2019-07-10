import java.io.*;

public class Prob13_4{
    public static void main(String[] args) throws IOException{
	System.out.printf("text:");
	String str = inputString();
	char[] str_char_array = str.toCharArray();
	for(int i = str.length()-1; i >= 0; i--){
	    System.out.printf("%c", str_char_array[i]);
	}

	System.out.println();
    }

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

}
