class reverseinteger {
     public int reverse(int x) {

        {
            int ans = 0;
            
            while (x != 0) {
                int t = x % 10;
                ans = (ans * 10) + t;
                if(ans>=Integer.MAX_VALUE || ans<=Integer.MIN_VALUE){
                    return 0;
                }
                x = x / 10;

            }
            return ans;

        }
    }
}