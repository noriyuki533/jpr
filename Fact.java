public class Fact{
    public static void main(String[] args){
	int f;
	f = factorial(5);
	System.out.println(f);
    }

    public static int factorial(int n){
	if((n == 0)|(n == 1)){
	    return 1;
	}
	return n * factorial(n-1);
    }
}
