class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            n=sum(n);
        }
        return n==1;
        
    }
    public static int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int res=n%10;
            sum+=res*res;
            n=n/10;
        }
        return sum;
    }
}