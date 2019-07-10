public class Prob13_2{
    public static void main(String[] args){
	int n = 100;
	int sum = 0;
	double ave;
	int[] scores = new int[100];
	for(int i = 0; i < n; i++){
	    scores[i] = (i*81+15)%101;
	    sum += scores[i];
	}
	ave = (double)sum / n;
	System.out.printf("合計点:%d 平均点:%f\n", sum, ave);
    }   
}
