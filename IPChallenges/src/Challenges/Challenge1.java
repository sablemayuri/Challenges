
package Challenges;

//imported the utility package of Scanner class
import java.util.Scanner;
public class Challenge1 {

	//created a static function named MemoryGame
	static void MemoryGame() {
		//created a scanner object using new operator
		Scanner sc = new Scanner(System.in);//taking input from user
		System.out.println("Enter the Total No. of Numbers:");
		int N = sc.nextInt();//user entered the total No. shown to team (array length)
		
		int []arr = new int[N];//new array created of size N

		for(int i = 0; i<N; i++) //for loop to take input from users in the array elements
		{
			arr[i]= sc.nextInt();
		}
		
		int Q = sc.nextInt();// to take the total number of queries
		
		for(int i = 0; i<Q; i++) {
			int Bi = sc.nextInt();
			int frequency = Findfrequency(arr,Bi);
			if(frequency>0){
				System.out.println(frequency);
			}else {
				System.out.println("Not Present");
			}
			
			
		}
		
		sc.close();//closing the scanner connection
	
	}
	
	//created a static function to find the frequency(number of times that input occurred)
	static int Findfrequency(int[]arr,int Bi) {
		int frequency = 0;
		for(int num:arr) {
			if(num==Bi) {
				frequency++;
			}
		}return frequency;
	}
	
	public static void main(String[] args) {
		
		//calling the MemoryGame method into the main method
		
		MemoryGame();
	}

}
