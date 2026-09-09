class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;

        int [] ans = new int[2*n];

        for (int num =0;num<n;num++){

            ans[num]= nums[num];
            
            ans[num+n]= nums[num];
            
        }
        return ans;
    }

}



