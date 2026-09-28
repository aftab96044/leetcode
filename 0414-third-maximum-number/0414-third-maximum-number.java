class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        int r = nums.length - 1;
        int count = 1;

        while(r > 0 && count < 3){
            if(nums[r] != nums[r-1]){
                count ++;
            }
            r--;
        }
        if(count == 3){
            return nums[r];
        }
        return nums[nums.length-1];

    }
}