class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> n = new HashSet<>(); 

        for(int i=0; i<nums.length; i++){
            n.add(nums[i]);

        }
        if(nums.length == n.size()){
            return false;
        }else{
            return true;
        }

    }
}