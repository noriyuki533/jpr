public class Student{
    String name;
    int sbjA, sbjB, sbjC;
    
    public Student(){
	name = "";
	sbjA = 0;
	sbjB = 0;
	sbjC = 0;
    }

    public Student(String name, int a, int b, int c){
	this.name = name;
	sbjA = a;
	sbjB = b;
	sbjC = c;
    }

    public int total(){
	return sbjA + sbjB + sbjC;
    }
    
    public double average(){
	return this.total() / 3.0;
    }
}
