class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 1;
        int j = 1;
        while(j < n){
            if(nums[i-1] != nums[j]){
                nums[i] = nums[j];
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i;
    }
}