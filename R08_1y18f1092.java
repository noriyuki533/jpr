import java.io.*;
import java.util.*;

public class R08_1y18f1092{
    static int count = 0;
    public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.printf("How many disks ? :");
	int n = Integer.parseInt(br.readLine());
	hanoi(n, 1, 2, 3);
	System.out.printf("Total step : %d\n", count);
    }
    
    public static void hanoi(int n, int from, int via, int to){
	if(n == 0){
	    return;
	}
	else{
	    hanoi(n-1, from, to, via);
	    System.out.printf("[%d]disk(%d) : %d -> %d\n", ++count, n, from, to);
	    hanoi(n-1, to, from, via);
	}
    }
}
