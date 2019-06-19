public class R10_1y18f1092 {
    public static void main(String[] args) {
	int total;
	double ave;
	Student st1 = new Student();
	st1.name = "AAA";
	st1.sbjA = 87;
	st1.sbjB = 70;
	st1.sbjC = 84;
	total = st1.total();
	ave = st1.average();
	System.out.println(st1.name + " : " + total + ", " + ave);
	Student st2 = new Student("BBB", 84, 86, 91);
	total = st2.total();
	ave = st2.average();
	System.out.println(st2.name + " : " + total + ", " + ave);
    }
}
