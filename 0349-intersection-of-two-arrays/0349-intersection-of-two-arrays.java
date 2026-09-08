class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> nums3 = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (nums3.isEmpty() || nums3.get(nums3.size() - 1) != nums1[i]) {
                        nums3.add(nums1[i]);
                    }
                }
            }
        }
        ;

        int[] res = new int[nums3.size()];

        for (int i = 0; i < nums3.size(); i++) {
            res[i] = nums3.get(i);
        }
        return res;
    }
}