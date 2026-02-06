class Solution {
    public int removeDuplicates(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();
       for(int x : nums){
        list.add(x);
       } 
     ArrayList<Integer> unique = new ArrayList<>(new LinkedHashSet<>(list));
     
     for(int i = 0;i<unique.size();i++){
        nums[i] = unique.get(i);
     }

     return unique.size();
    }
}