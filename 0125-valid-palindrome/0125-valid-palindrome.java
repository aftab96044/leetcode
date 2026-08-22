class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char [] arr = t.toCharArray();

        int l = 0;
        int r = arr.length - 1;

        while(l < r){
            if(arr[l] != arr[r]){
                return false;
            }else if(arr[l] == arr[r]){
                l++;
                r--;

            }
        }
        return true;
        
    }
}