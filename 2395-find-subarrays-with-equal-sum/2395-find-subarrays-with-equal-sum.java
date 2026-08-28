class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> temp=new HashSet<>();

        for(int i=0;i<nums.length-1;i++)
        {
            int sum=nums[i]+nums[i+1];

             if (temp.contains(sum)) {
                return true;
            }
            temp.add(sum);
        }
        return false;
        
    }
}