package src;

public class Warmup1 {

    /*
    The parameter weekday is true if it is a weekday, and the parameter vacation is true
    if we are on vacation. We sleep in if it is not a weekday or we're on vacation.
    Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
    */

    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday && !vacation){
            return true;
        } else if (weekday && !vacation) {
            return false;
        }
        return true;
    }
    /*
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is
    smiling. We are in trouble if they are both smiling or if neither of them is smiling.
    Return true if we are in trouble.

   monkeyTrouble(true, true) → true
   monkeyTrouble(false, false) → true
   monkeyTrouble(true, false) → false
   */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (aSmile && bSmile){
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        }
        else return false;
    }

    /*
    Given two int values, return their sum. Unless the two values are the same, then return
    double their sum.

    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
     */
    public int sumDouble(int a, int b) {

        int sum= a+b;

        if (a==b){
            return 2*sum;
        }
        else return sum;
    }

    /*
    Given an int n, return the absolute difference between n and 21, except return double the
    absolute difference if n is over 21.
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
     */
    public int diff21(int n) {

        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

}
