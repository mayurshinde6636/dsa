class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] temp = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            temp[i + nums.length] = nums[i];
        }

        return temp;
    }
}