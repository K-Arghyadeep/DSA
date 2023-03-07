import java.util.*;
class SelectionSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = acceptArray(size);
		a = sortArray(a);
		display(a);
	}
	static int[] acceptArray(int size){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		int[] a = new int[size];
		for(int i = 0;i < size;i++){
			a[i] = sc.nextInt();
		}
		return a;
	}
	static int[] sortArray(int a[]){
		int len = a.length;
		int temp;
		for(int i = 0; i<len-1 ; i++){
			for(int j = i+1; j<len;j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	static void display(int a[]){
			System.out.println(Arrays.toString(a));
	}
}
