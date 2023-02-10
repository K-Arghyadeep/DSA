//typical binary search
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {12,13,54,76,53,25,87,9,23,76,34,65,27,95,52,82};
        int target = 25;
        int[] sortedArray = Sort(array);
        BSearch(sortedArray,target);
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
                System.out.println("Target is present at index "+mid);
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