public class R06_1y18f1092{
    public static void main(String[] args){
	int n = 10;
	int[][] score = new int[n][3];
	
	for(int i = 0; i < n; i++){
	    score[i][0] = (i*83 + 15) % 101;
	    score[i][1] = (i*91 + 33) % 101;
	    score[i][2] = (i*67 + 69) % 101;
	}

	System.out.println("Total points of students");

	for(int i = 0; i < n; i++){
	    int sum = 0;
	    for(int j = 0; j < 3; j++){
		sum += score[i][j];
	    }
	    
	    System.out.printf("%d : %d\n", i, sum);
	}
    }
}
