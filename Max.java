public class Max{
    public static void main(String[] args){
	int[] a = {33, 49, 82, 24, 65};
	int max1, max2, max3;
	
	max1 = maxOf(a[0], a[1]);
	max2 = maxOf(a);
	max3 = maxOf(a[0], a[1], a[2]);

	System.out.printf("max1 : %d\nmax2 : %d\nmax3 : %d\n", max1, max2, max3);
    }
    
    public static int maxOf(int a, int b){
	return a > b ? a : b; 
    }

    public static int maxOf(int a, int b, int c){
	return (a > b)&&(a > c) ? a : (b > a)&&(b > c) ? b : c;
    }

    public static int maxOf(int[] a){
	int max = a[0];
	for(int i = 0; i < a.length; i++){
	    if(a[i] > max){
		max = a[i];
	    }
	}
	return max;
    }
}
