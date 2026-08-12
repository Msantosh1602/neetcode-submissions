class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int n:set){
            if(set.contains(n-1)) continue;
            int curr=n;
            int count =1;
            while(set.contains(curr+1)){
                curr++;
                count++;
            }
            max=Math.max(max,count);

        }
        return max;
    }
}
