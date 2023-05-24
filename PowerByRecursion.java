


class Solution {
    public double myPow(double x, int n) {
        if(n==0)
        {
            return 1;
        }
        if(n>0)
        { 
            double temp;
            if(n%2==0){
                temp=myPow(x,n/2);
                return temp*temp;
            }
            else
            {
                temp=myPow(x,(n-1)/2);
                return temp*temp*x;
            }
        }
        else
        { 
            double temp2;
            if(n%2==0){
                temp2=myPow(x,n/2);
                return (temp2)*(temp2);
            }
            else
            {
                temp2=myPow(x,(n+1)/2);
                return (temp2)*(temp2)*(1/x);
            }
        }
    }
}
