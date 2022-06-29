//array contain no.'s form 1-n-1 as one of the number is missing and there is no repetetion.

public class MissingNumberInArray {
  public static int missingNumberInArray(int arr[], int n){

      //lets get the sum of first n numbers
      int sum1 = n*(n+1)/2;
      int sum2 = 0;
      //run a loop to get the sum of the numbers sum of the numbers present in the array
      for(int i = 0; i<n; i++){
          sum2 += arr[i];
      }
      //subtract the sum of the no.'s in array from the sum of n numbers.
      return sum1 - sum2;
  }

    public static void main(String[] args) {

    }
}
