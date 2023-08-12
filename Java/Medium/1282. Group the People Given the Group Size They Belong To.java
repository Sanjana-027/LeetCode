class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] flags = new boolean[groupSizes.length];
        

        for (int i = 0; i < groupSizes.length; i++) {
            int search = groupSizes[i];
            if (flags[i] == false) {
                List<Integer> temp = new ArrayList<>();
            
                for (int j = i; j < groupSizes.length; j++) {
                    if (flags[j] == false) {
                        if (search == groupSizes[j]) {
                            if (temp.size() != search) {
                                temp.add(j);
                            }
                            else {
                                ans.add(new ArrayList<>(temp));
                                temp = new ArrayList<>();
                                temp.add(j);
                            }
                            flags[j] = true;
                        }   
                    }
                }
            
                ans.add(new ArrayList<>(temp));
            }
        } 

        return ans;
    }
}
