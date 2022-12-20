class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] flags = new boolean[rooms.size()];
        flags[0] = true;
        canVisitAllRooms(rooms, flags, 0);
        for (boolean flag : flags) {
            if (!flag) return false;
        }
        return true;
    }
    public void canVisitAllRooms(List<List<Integer>> rooms, boolean[] flags, int idx) {

        for (int i = 0; i < rooms.get(idx).size(); i++) {
            int newIdx = rooms.get(idx).get(i);
            
            if (!flags[newIdx]) {
                flags[newIdx] = true;
                canVisitAllRooms(rooms, flags, newIdx);
            }
        }
    }
}
