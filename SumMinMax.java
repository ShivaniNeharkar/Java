/* @author: Shivani Neharkar
   @date  : 11th January 2023 
   @topic : MIN MAX ElEMENT SUMMATION  */


//Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        min=max=A[0];
        for(int k=1;k<N;k++)
        {
            if(A[k]<min)
            {
                min=A[k];
            }
            else if(A[k]>max)
            {
                max=A[k];
            }
            
        }
        sum=min+max;
        return sum;
    }
}
