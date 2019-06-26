public class R11_1y18f1092{
    public static void main(String[] args){
	System.out.printf("How many stundents ? >");
	int n = Input.intNum();
	Student[] students = new Student[n];

	for(int i = 0; i < n; i++){
	    System.out.printf("== Student %d  ==\n", i);
	    students[i] = new Student();
	    System.out.printf("name >");
	    students[i].name = Input.string();
	    System.out.printf("subject A >");
	    students[i].sbjA = Input.intNum();
	    System.out.printf("subject B >");
	    students[i].sbjB = Input.intNum();
	    System.out.printf("subject C >");
	    students[i].sbjC = Input.intNum();
	}

	System.out.println("===============");

	for(int i = 0; i < n; i++){
	    System.out.printf("#%d : %s, %d, %f\n", i, students[i].name, students[i].total(), students[i].average());
	}

	System.out.println();

    }
    
}
