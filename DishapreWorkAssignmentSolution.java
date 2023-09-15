import java.util.*;
class DishapreWorkAssignmentSolution{
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);
		System.out.println("1. check for palindrome number");
		System.out.println("2. prints the pattern of stars in decreasing order based on the number that is input");
		System.out.println("3. check whether the input number is a prime number");
		System.out.println("4. print Fibonacci series of size n with first two numbers as 0, 1");
		System.out.println("Choose the operation you want to perform: ");
		int num= in.nextInt();
		int number=0;
		if(num>0 && num<=4){
			System.out.println("Please enter the number: ");
			number=in.nextInt();
		}
		switch(num){
			case 0: System.exit(0);
			case 1: palindrome(number,0);break;
			case 2: printStars(number);break;
			case 3: prime(number);break;
			case 4: fibonacci(number);break;
			default : System.out.println("Please enter a valid number.");	
		}
	}

	static void palindrome(int number,int reverse_num){
		int o_number=number;
		while(number>0){
			reverse_num = (reverse_num*10 )+number%10;
			number = number/10;
		}
		if(o_number==reverse_num){
			System.out.println("Yes Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}

	static void printStars(int number){
		int iterate=number;
		while(iterate>0){
			for(int i=iterate;i>0;i--){
				System.out.print("*");
			}
			System.out.println();
			iterate--;
		}
	}

	static void prime(int number){
		String Result="It is a prime number";
		for(int i=2;i<number;i++){
			if(number%i==0){
				Result="It is not a prime number";
				break;
			}
		}
		System.out.println(Result);
	}

	static void fibonacci(int number){
		int arr[]=new int[number];
		if(number>0){
			int i=0;
			while(i<number){
				if(i==0){
					arr[0]=0;
				}
				else if(i==1){
					arr[1]=1;
				}
				else{
					arr[i]=arr[i-1] + arr[i-2];
				}
				i++;
			}
			for(int j=0;j<number;j++){
				if(j==number-1){
					System.out.print(arr[j]);
				}else{
					System.out.print(arr[j]+",");
				}
			}
		}else{
			System.out.println("Please enter a number greater than 0.");
		}
	}
}