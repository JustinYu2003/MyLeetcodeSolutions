//First attempt making use of continue
public List<String> fizzBuzz(int n) {
    //Create the list
    ArrayList<String> output = new ArrayList<String>();
    //Iterate from 1 to n
    for(int i = 1; i <= n; i++) {
        //Check if its divisible by 3 and 5
        if(i % 3 == 0 && i % 5 == 0) {
            //If it is, add Fizzbuzz then continue iterating
            output.add("FizzBuzz");
            continue;
        }
        //If not, check if its divisible by 3
        if(i % 3 == 0) {
            //If it is, add Fizz then continue iterating
            output.add("Fizz");
            continue;
        }
        //If not, check if its divisible by 5
        if(i % 5 == 0) {
            //If it is, add Buzz then continue iterating
            output.add("Buzz");
            continue;
        }
        //If not, add i to the list
        output.add(Integer.toString(i));
    }
    //Return the list
    return output;
}

//Second attempt not using continue
public List<String> fizzBuzz(int n) {
    //Create the list
    ArrayList<String> output = new ArrayList<String>(); 
    //Iterate from 1 to n
    for(int i = 1; i <= n; i++) { 
        if(i % 3 == 0 && i % 5 == 0) { //Check if its divisible by 3 and 5 
            //If it is, add Fizzbuzz then continue iterating
            output.add("FizzBuzz");
        }else if(i % 3 == 0) { //If not, check if its divisible by 3
            //If it is, add Fizz then continue iterating
            output.add("Fizz");
        }else if(i % 5 == 0) { //If not, check if its divisible by 5
            //If it is, add Buzz then continue iterating
            output.add("Buzz");
        }else {
            output.add(Integer.toString(i)); //If not, add i to the list
        }        
    }
    return output; //Return the list
}