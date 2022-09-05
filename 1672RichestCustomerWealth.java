//First attempt
public int maximumWealth(int[][] accounts) {
    int wealth = 0;
    int counter = 0;
    //Iterate through every array
    for(int i = 0; i < accounts.length; i++) {
        //Iterate through every elt
        for(int j = 0; j < accounts[i].length; j++) {
            counter += accounts[i][j];
        }
        //Check if the wealth of this customer is higher than the current highest
        if(counter > wealth) {
            wealth = counter;
        }
        counter = 0;
    }
    return wealth;
}