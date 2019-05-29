import java.io.*;
import java.util.*;


public class R07_1y18f1092{

    public static int inputInt(){
	int a = 0;
	try{
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    a = Integer.parseInt(br.readLine());
	}
	catch(Exception e){
	    System.out.println(e);
	    System.exit(1);
	}
	return a;
    }

    public static int[] maxOfArray(int[] a) {
	int max, max_i;
	max = a[0];
	max_i = 0;
	for (int i=1; i<a.length; i++) {
	    if (a[i] > max){
		max = a[i];
		max_i = i;
	    }
	}
	int[] max_info = {max_i, max};
	return max_info;
    }

    public static void main(String[] args){
	System.out.printf("Input number of students: ");
	int n = inputInt();
	int[] scores = new int[n];
	
	System.out.printf("\nStudents over 90 scores\n");
	for(int i = 0; i < n; i++){
	    scores[i] = (i*83 + 15) % 101;
	    if(scores[i] >= 90){
		System.out.printf("No.%d : %d\n", i, scores[i]);
	    }
	}
	int[] m = maxOfArray(scores);
	System.out.printf("No.%d got the highest score %d\n", m[0], m[1]);

	
	
    }
}
