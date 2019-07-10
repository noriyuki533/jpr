import java.io.*;

public class Prob13_3{
    public static void main(String[] args) throws IOException{
	System.out.printf("a:");
	int a = inputInt();
	System.out.printf("b:");
	int b = inputInt();
	System.out.printf("add:%d, sub:%d, mul:%d, div:%d\n", add(a,b), sub(a,b), mul(a,b), div(a,b));
	    }

    public static int inputInt(){
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

    public static int add(int a, int b){
	return a + b;
    }

    public static int sub(int a, int b){
	return a - b;
    }

    public static int mul(int a, int b){
	return a * b;
    }

    public static int div(int a, int b){
	return a / b;
    }
}
