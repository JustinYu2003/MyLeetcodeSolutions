//First attempt,
public int numberOfSteps(int num) {
    int counter = 0;
    //Loop until the num is 0
    while(num != 0) {
        //If the number is even, divide by 2
        if(num % 2 == 0) {
            num /= 2;
        } else {//If the number is odd, subtract by 1
            num--;   
        }
        counter++;
    }
    return counter;  
}

//Can optimize using binary form and bitmasks/bits