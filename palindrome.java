class palindrome {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        int original = x;
        int ans = 0;
        while(x!=0){
            int t=x%10;
            ans = ans*10 + t;
            x=x/10;
        }
        if(ans==original){
            return true;}
        else
            return false;
    }
}