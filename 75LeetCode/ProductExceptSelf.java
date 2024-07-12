class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] prefix = new int[nums.length];
    int[] suffix = new int[nums.length];
    prefix[0]=1;
    suffix[nums.length-1]=1;
    int k = nums.length;

    for(int i =0;i<nums.length-1;i++){
        prefix[i+1] = nums[i] * prefix[i];  
    }
    for(int i =nums.length-2;i>=0;i--){
        suffix[i] = suffix[i+1] * nums[i+1];
    }

    for(int i =0;i<nums.length;i++){
        nums[i]= prefix[i]*suffix[i];
    }

return nums;
}
}