class Problem9_Palindrome {
    public boolean isPalindrome(int x) {
        if(x<0){        //if the vlaue of x is negative, return false
            return false;
        }
        int og = x;    //to retain the original value of x because x will keep updating and changin in the future 
        int rev = 0;   //reversed number. this number right now is 0, it will be updated under the loop.
        while (x != 0){  //palindrome is possible only for positive numbers.
            int digit = x % 10;   //access the last digit. if 121 is x, 121 % 10 becomes 1.
            rev = rev * 10 + digit;  //begins from 0 as initially, rev=0. then rev becomes 0 * 10 + 1 = 1
            x = x / 10;  //updates x everytime. takes the quotient. 121/10 = 12. Now x becomes 12 and the loop will run from x = 12
        }
        if(rev==og){
            return true;
        }
        else{
            return false;
        }
    }
}
