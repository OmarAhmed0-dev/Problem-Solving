class Solution {
    public boolean lemonadeChange(int[] bills) {
    int numberOfFive = 0;
    int numberOfTen = 0;
    
    for(int i = 0 ; i <bills.length ; i++) {
        if(bills[i] == 10) {
            if(numberOfFive > 0) {
                numberOfFive--;
                numberOfTen++;
            }
            else {
                return false;
            }
        }
        else if(bills[i] == 20) {
            if(numberOfFive > 0) {
                if(numberOfTen >0) {
                    numberOfFive--;
                    numberOfTen--;
                } else if (numberOfTen == 0 && numberOfFive>=3) {
                    numberOfFive -=3;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }

        }
        else {
            numberOfFive++;
        }
        
    }
        return true;
        
    }
}