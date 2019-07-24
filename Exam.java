public class Exam{

    public static void main(String[] args){
	int[] nums = new int[1000];
	for(int i = 0; i < nums.length; i++){
	    nums[i] = (i*83+15) % 3001;
	}
	
	for(;;){
	    System.out.printf("Input n (0 -- 3000, or -1 for quit) >");

	    int n = Input.intNum();

	    if(n == -1)break;

	    findNum(n, nums);  
	}
	
    }

    public static void findNum(int num, int[] nums){
	boolean b = false;
	for(int i = 0; i < nums.length; i++){
	    if(nums[i] == num){
		System.out.printf("%d is found in data\n", num);
		b = true;
		break;
	    }
	}

	if(!b)System.out.printf("%d is not found in data\n", num);

	
    }

}
