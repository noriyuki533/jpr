import java.math.*;

public class Complex{
    private double re;
    private double im;

    public Complex(){
	re = 0;
	im = 0;
    }
    
    public Complex(double a, double b){
	re = a;
	im = b;
    }

    public void set(double a, double b){
	re = a;
	im = b;
    }

    public void print(){
	if(im == 0){
	    System.out.println(re);
	}
	else{
	    String sgn = im > 0 ? "+" : "-";
	    System.out.printf("%.2f %s %.2fi\n", re, sgn, Math.abs(im));
	}
    }

    public static Complex add(Complex a, Complex b){
	Complex result = new Complex(a.re+b.re, a.im+b.im);
	return result;
    }

    public static Complex sub(Complex a, Complex b){
	Complex result = new Complex(a.re-b.re, a.im-b.im);
	return result;
    }

    public static Complex mul(Complex a, Complex b){
	Complex result = new Complex(a.re*b.re-a.im*b.im, a.re*b.im+b.re*a.im);
	return result;
    }

    public static Complex div(Complex a, Complex b){
	Complex result = new Complex((a.re*b.re+a.im*b.im)/(Math.pow(b.re,2)+Math.pow(b.im,2)), 
				     (b.re*a.im-a.re*b.im)/(Math.pow(b.re,2)+Math.pow(b.im,2)));
	return result;
    }

}
