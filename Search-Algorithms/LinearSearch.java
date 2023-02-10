import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int size,target,i;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int[] a = new int[size];
        
        System.out.println("Enter the elements of the array");
        for(i = 0;i<size;i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to search");
        target = sc.nextInt();

        for(i = 0;i<size;i++)
        {
            if(a[i]==target)
            {
                flag = true;
                break;
            }    
        }
        if(flag == true)
            System.out.println("The element is present in the array");
        else
            System.out.println("Targeted element is absent in the array");
    }
}



/* Linear Search is a searching algorithm used to search the targeted element.
 * It searches the array from either end of the array and moves to the other end unless you get the targeted element.
 * The time complexity of Linear Search is O(n) and space complexity is O(1)
*/