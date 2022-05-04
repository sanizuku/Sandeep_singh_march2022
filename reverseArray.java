import java.util.Scanner;

public class reverseArray {
	public static void printArray(int[] arr) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
	public static void reverse(int[] numbers,int start,int end) {
		while(start<end) {
			int temp=numbers[start];
			numbers[start]=numbers[end];
			numbers[end]=temp;
			start++;
			end--;
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int[] numbers=new int[n];
		System.out.println("Enters the no of elements in array");
		for(int i=0;i<n;i++) {
			numbers[i]=sc.nextInt();
		}
	printArray(numbers);
    reverse(numbers,0,numbers.length-1);
    printArray(numbers);
	}

}
