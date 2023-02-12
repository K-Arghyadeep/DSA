//typical binary search
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array.");
        int[] array = new int[size];
        for(int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        Arrays.sort(array);
        BSearch(array,target);
    }
    static int[] Sort(int[] array){
        int n = array.length;
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;i<n;i++){
                if(array[j]<=array[i])
                {
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
    static void BSearch(int[] array,int target){
        int start = 0, end = (array.length-1),count=0,mid;
        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(array[mid]==target)
            {
                System.out.println(target +" is present." );
                count++;
                break;
            }
            if(array[mid]>target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        if(count==0)
            System.out.println(target+" is not present");
    }
}
