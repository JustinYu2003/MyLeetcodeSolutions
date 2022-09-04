import java.util.Hashmap;

//First attempt
public int[] twoSum(int[] nums, int target) {
    int[] indexes = new int[2];
    for(int i = 0; i < nums.length-1; i++) {
        for(int j = i+1; j < nums.length; j++) {
            if(nums[i] + nums[j] == target) {
                indexes[0] = i;
                indexes[1] = j;
                return indexes;
            }
        }
    }
    return indexes;
}

//Second attempt
public int[] twoSum(int[] nums, int target) {
    //Hashmap to store previous numbers from the array
    HashMap<Integer, Integer> prevNums = new HashMap<Integer, Integer>();
    //Iterate through the array
    for(int i = 0; i < nums.length; i ++) {
        //Subtract the target by the current number
        //Then check the hashmap keySet to see if it contains that number
        //If the keySet contains that number, return those two indexes
        if(prevNums.containsKey(target-nums[i])) {
            int[] indexes = {i, prevNums.get(target-nums[i])};
            return indexes;
        }
        //If can't find it, put the current index and the number at that index
        //in the hashmap of previous numbers
        prevNums.put(nums[i], i);
    }
    return null;
}