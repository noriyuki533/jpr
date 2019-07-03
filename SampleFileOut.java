import java.io.*;
public class SampleFileOut {
    public static void main(String[] args) {
	String filename = "sample_number.txt";
	String line;
	try {
	    FileWriter fw = new FileWriter(filename);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter pw = new PrintWriter(bw);
	    for(int i=1;i<=10;i++){
		System.out.println(i*100);
		pw.println(i*100);
	    }
	    pw.close();
	}
	catch (Exception e) {
	    System.out.println(e);
	    System.exit(1);
	}
    }
}
