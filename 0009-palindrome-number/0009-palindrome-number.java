class Solution {
    public boolean isPalindrome(int x) {
      if (x<0)
      {
        return false;
      }
      int org,rev=0,r;
      org=x;
      while(x>0)
      {
        r=x%10;
        rev=(rev*10)+r;
        x=x/10;
      }
      if(rev==org)
      {
        return true;
      }
      return false;
    }
}