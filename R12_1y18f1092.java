import java.io.*;
public class R12_1y18f1092 {
    public static void main(String[] args) {
	String filename = args[0];
	String line;
	
	System.out.printf("Find : ");
	String query = Input.string();
	int cnt = 0;
	try {
	    FileReader fr = new FileReader(filename);
	    BufferedReader br = new BufferedReader(fr);
	    while ((line = br.readLine()) != null) {
		if(line.contains(query)){
		    System.out.printf("%s at line %d in %s\n", query, cnt, filename);
		}
		cnt++;
	    }
	    br.close();
	}
	catch (Exception e) {
	    System.out.println(e);
	    System.exit(1);
	}
    }
}
