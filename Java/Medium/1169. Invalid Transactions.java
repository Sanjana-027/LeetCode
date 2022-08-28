class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        Map<String, List<String[]>> map = new HashMap<String, List<String[]>>();
        
        for (String currTransaction : transactions) {
            String[] splitTransaction = currTransaction.split(",");
            map.putIfAbsent(splitTransaction[0] , new ArrayList<String[]>());
            map.get(splitTransaction[0]).add(splitTransaction);
        }
        
        List<String> result = new ArrayList<String>();
        for (String currTransaction : transactions) {
            String[] splitTransaction = currTransaction.split(",");
            
            if (Integer.parseInt(splitTransaction[2]) > 1000){
                result.add(currTransaction);
            }
            else {
                for (String[] curr : map.get(splitTransaction[0])) {
                    if(!curr[3].equals(splitTransaction[3]) && Math.abs(Integer.parseInt(splitTransaction[1]) - Integer.parseInt(curr[1])) <= 60) {
                        result.add(currTransaction);
                        break;
                    }
                }
            }
        }
        
        return result;
        
    }
}
