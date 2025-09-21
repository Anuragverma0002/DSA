class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Approach 2 using hashing
        int pair[] = new int[2];
        HashMap<Integer , Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int result = target-nums[i];
            if(map.get(result)!=null){
                pair[0]=map.get(result);
                pair[1]=i;
            }
            else{
                map.put(nums[i] , i);
            }
        }
        return pair;
        
        // Approach 1 Time complexity --> nlog(n)
        // int pair[]=new int[2];
        // // create copy of original array.
        // int aux[] = Arrays.copyOf(nums,nums.length);
        // // sort copy array
        // Arrays.sort(aux);
        // int i=0; 
        // int j=nums.length-1;
        // while(i<j){
        //     int sum=aux[i]+aux[j];
        //     if(sum==target){
        //         break;
        //     }
        //     else if(sum<target){
        //         i++;
        //     }
        //     else if(sum>target){
        //         j--;
        //     }
        // } 
        // // for original index.
        // for(int k=0; k<nums.length;k++){
        //     if(nums[k]==aux[i]){
        //         pair[0]=k;
        //     }
        // }
        // for(int k=nums.length-1; k>=0;k--){
        //     if(nums[k]==aux[j]){
        //         pair[1]=k;
        //     }
        // }
        // return pair;
    }
}