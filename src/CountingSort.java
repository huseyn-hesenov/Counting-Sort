import java.util.Arrays;

public class CountingSort {
    //create method for input array
    //return type is Sring because of i convert to string this array with toString method
    public String inputArray(int[] array ) {
        int n = array.length;

//create output array according input array
        int[] outputArray = new int[n];
        //create new array which all elements are zero
        int[] count = new int[30];
        for (int i = 0; i < 30; ++i) {
            count[i] = 0;
        }
        //increase count array elements untill array[i]
        for (int i = 0; i < n; ++i) {

            ++count[array[i]];
        }
        //sorting
        for (int i = 1; i <30; ++i) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            outputArray[count[array[i]] - 1] = array[i];
            --count[array[i]];
        }
        //swing
        for (int i = 0; i < n; ++i) {
            array[i] = outputArray[i];

        }
        //return sorted array
        return Arrays.toString(array);

    }
    public static void main(String[] args){

CountingSort countingSort=new CountingSort();
//input array
int []array={4,8,6,5,7,4,5};
        System.out.println("sorted array is:"+countingSort.inputArray(array));






    }
}
