
public class SampleBody3 {
    public static void main(String[] args) {
	double sw;

	System.out.println("== Student 1 ==");
	Body st1 = new Body("Frank", 175.0, 63.5);
	st1.print();

	sw = st1.stdWeight();
	System.out.println("standard weight : " + sw);

	System.out.println("== Student 2 ==");
	Body st2 = new Body("Thomas", 177.0, 72.0);
	st2.print();

	sw = st2.stdWeight();
	System.out.println("standard weight : " + sw);
    }
}
