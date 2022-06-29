//array contain no.'s form 1-n-1 as one of the number is missing and there is no repetetion.

public class MissingNumberInArray {
  public static int missingNumberInArray(int arr[], int n){
      int sum1 = n*(n+1)/2;
      int sum2 = 0;
      for(int i = 0; i<n; i++){
          sum2 += arr[i];
      }
      return sum1 - sum2;
  }

    public static void main(String[] args) {

    }
}
