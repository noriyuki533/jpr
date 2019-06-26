public class SampleBody4{
    public static void main(String[] args){
	double sw;
	Body[] st = new Body[3];
	st[0] = new Body("Frank", 175, 64);
	st[1] = new Body("Thomas", 165, 42);
	st[2] = new Body();
	st[2].setName("Peter");
	st[2].setHeight(171);
	st[2].setWeight(41);

	for(int i = 0; i < st.length; i++){
	    System.out.printf("==Student%d==", i);
	    st[i].print();
	    sw = st[i].stdWeight();
	    System.out.printf("sw: %fkg\n", sw);
	}
    }
}
