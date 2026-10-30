class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            char ch = num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch)
            {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0)
        {
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st)
        {
            sb.append(c);
        }
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0')
        {
            i++;
        }
        String ans = sb.substring(i);
        if(ans.length()==0)
        {
            return "0";
        }
        return ans;


        
    }
}