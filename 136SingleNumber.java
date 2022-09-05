import java.util.Hashmap;

//First attempt
public int singleNumber(int[] nums) {
    //Make a hashmap, keys are the elts of the array, values are number of times the elt has been in the array
    HashMap<Integer, Integer> allNums = new HashMap<Integer, Integer>();
    //Iterate through the array once
    for(int i = 0; i < nums.length; i++) {
        //Check if this key is already in the hashmap
        if(allNums.containsKey(nums[i])) {
            //If it is, get the value associated with the elt, then increase it by 1
            allNums.put(nums[i], allNums.get(nums[i])+1);
        }else {
            //If not, add it to the hashmap with the key being the elt, and the value being 1
            allNums.put(nums[i], 1);
        }
    }
    //Check which key has an associated value of 1, then return that key
    for(int key : allNums.keySet()) {
        if(allNums.get(key) == 1) {
            return key;
        }
    }
    return -1;
}

//Note, can also make use of ^= every element of the array to an int, then return the result
//because of bitwise properties and XOR