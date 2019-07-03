public class SampleArgs{
    public static void main(String[] args) {
	for(int i=0;i<args.length;i++){
	    System.out.println("args[" +i+ "] : " + args[i]);
	}

	System.out.println(args[0]+args[1]);
	
	int x1 = Integer.parseInt(args[0]);
	double x2 = Double.parseDouble(args[1]);

	System.out.println(x1+x2);
    }
}
