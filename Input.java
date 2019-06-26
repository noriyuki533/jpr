import java.io.*;
public class Input {

    public static int intNum() {
	int n = 0;
	try {
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    n = Integer.parseInt(br.readLine());
	}
	catch(Exception e) {
	    System.out.println(e);
	    System.exit(1);
	}
	return n;
    }
    
    public static double doubleNum() {
	double d = 0.0;
	try {
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    d = Double.parseDouble(br.readLine());
	}
	catch(Exception e) {
	    System.out.println(e);
	    System.exit(1);
	}
	return d;
    }
    
    public static String string() {
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
