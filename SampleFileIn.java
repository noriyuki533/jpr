import java.io.*;
public class SampleFileIn {
    public static void main(String[] args) {
	String filename = args[0];
	String line;
	try {
	    FileReader fr = new FileReader(filename);
	    BufferedReader br = new BufferedReader(fr);
	    while ((line = br.readLine()) != null) {
		System.out.println(line);
	    }
	    br.close();
	}
	catch (Exception e) {
	    System.out.println(e);
	    System.exit(1);
	}
    }
}
