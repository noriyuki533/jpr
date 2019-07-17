public class Prob14{
    public static void main(String[] args){
	double tmp_re, tmp_im;
	Complex a1 = new Complex();
	Complex a2 = new Complex();
	Complex z = new Complex();
	
	System.out.printf("a1 Real part:");
	tmp_re = Input.doubleNum();
	System.out.printf("a1 Imaginary part:");
	tmp_im = Input.doubleNum();
	a1.set(tmp_re, tmp_im);
	
	System.out.printf("a2 Real part:");
	tmp_re = Input.doubleNum();
	System.out.printf("a2 Imaginary part:");
	tmp_im = Input.doubleNum();
	a2.set(tmp_re, tmp_im);

	System.out.print("a1 :");
	a1.print();
	System.out.print("a2 :");
	a2.print();

	System.out.printf("a1 + a2 = ");
	z.add(a1, a2).print();
	System.out.printf("a1 - a2 = ");
	z.sub(a1, a2).print();	
	System.out.printf("a1 * a2 = ");
	z.mul(a1, a2).print();
	System.out.printf("a1 / a2 = ");
	z.div(a1, a2).print() ;   
    }
}
