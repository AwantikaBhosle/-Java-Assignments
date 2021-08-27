//Write a JAVA program which reads a sequence of integers and prints mode values of the sequence. The number of integers is greater than or equals to 1 and less than or equals to 100.   Note: The mode of a set of data values is the value that appears most often. 
    
import java.util.Scanner;
 public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cnt[] = new int[100];
		int i;
        System.out.println("How many integers would you like to input(Max.100?)");
		int x = input.nextInt();
        System.out.println("Input the integers:");
        for (i = 0; i <x; i++){ 
         int n = input.nextInt();
            cnt[--n]++;	
		}
		 
        int max = 0;
        for (int n : cnt){
            if (max < n){
                max = n;
            }
        }
         System.out.println("Mode value(s)in ascending order:");
        for (i = 0; i < cnt.length; i++){
            if (cnt[i] == max){
                System.out.println(i + 1);
            }
        }
    }
}
