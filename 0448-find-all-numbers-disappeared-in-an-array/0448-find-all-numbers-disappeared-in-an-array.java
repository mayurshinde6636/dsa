class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n = nums.length;
        
        boolean[] present = new boolean[n + 1];
        
        // Mark numbers which are present
        for (int i = 0; i < n; i++) {
            present[nums[i]] = true;
        }
        
        List<Integer> ans = new ArrayList<>();
        
        // Find numbers which are not present
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                ans.add(i);
            }
        }
        
        return ans;
    }
}