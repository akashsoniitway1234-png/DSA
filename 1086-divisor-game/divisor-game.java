class Solution {
    public boolean divisorGame(int n) {
        n = n-1;
        if(n % 2 == 0){
            return false;
        }
        else{
            return true;
        }
    }
}