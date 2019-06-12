public class SampleString{
    static public void main(String[] args){
	char c1 = 'a', c2 = 65;
	char[] cc = {'a', 'b', 'c'};
	String s1;
	String s2 = "efgh";
	
	s1 = "abcd";
	System.out.println(s1);
	s1 += s2;
	System.out.println(s1);

	System.out.printf("c1:%c", c1);
	System.out.printf("c1:%d", (int)c1);
	System.out.printf("c2:%c", c2);

    }
}
