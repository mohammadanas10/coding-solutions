class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans=-1;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count > max || (count == max && nums[i] < ans)){
                    max=count;
                    ans=nums[i];
                }
            }
        }
        return ans;
    }
}