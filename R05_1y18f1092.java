import java.io.*;
import java.util.*;

public class R05_1y18f1092{
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("n :");
	int n = Integer.parseInt(br.readLine());
	
	long for_loop_start = System.currentTimeMillis();
	for(int i = 0; i < n; i++){
	    for(int j = 0; j < n-i; j++) System.out.print(" ");
	    //System.out.print(String.join("", Collections.nCopies(n-i, " ")));
	    for(int k = 0; k < 2*i+1; k++)System.out.print("*");
	    //System.out.print(String.join("", Collections.nCopies(2*i+1, "*")));
	    System.out.println("");
	}
	long for_loop_end = System.currentTimeMillis();
  	
	long col_start = System.currentTimeMillis();
	for(int i = 0; i < n; i++){
	    //for(int j = 0; j < n-i; j++) System.out.print(" ");
	    System.out.print(String.join("", Collections.nCopies(n-i, " ")));
	    //for(int k = 0; k < 2*i+1; k++)System.out.print("*");
	    System.out.print(String.join("", Collections.nCopies(2*i+1, "*")));
	    System.out.println("");
	}
	long col_end = System.currentTimeMillis();

	System.out.printf("\nfor_loop: %dms\n", for_loop_end-for_loop_start);
	System.out.printf("\ncollections: %dms\n", col_end-col_start);

	System.out.println("");
    }
}
