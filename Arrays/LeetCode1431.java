class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i<candies.length; i++){
            int currentCandies = candies[i] + extraCandies;
            boolean greatest = true;
            for(int j = 0; j<candies.length; j++){
                if(currentCandies<candies[j]){
                    greatest = false;
                    break;
                }
            }
            result.add(greatest);
        }
        return result;
    }
}
