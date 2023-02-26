import java.util.*;
public class InsertionSort {
    static void Sort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] array=new int[n];
        int temp;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
            for(int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    break;
                }
                if(array[j]>array[j-1]){
                    break;
                }
            }
        }
        System.out.println("Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
                }
    }
    public static void main(String[] args) {
        Sort();
    }
}
