class Solution {
    public void reverseString(char[] s) {
        int leftindex=0;
        int rightindex=s.length-1;

        while(leftindex<rightindex){
            char temp=s[leftindex];
            s[leftindex]=s[rightindex];
            s[rightindex]=temp;

            leftindex++;
            rightindex--;
        }
        
    }
}