package easy.Palindrom;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int orignal = x;

        if(x<0){
            return false;
        }

        if (x==0){
            return true;
        }

        while(x>0){
            int digit = x%10;
            rev = (rev*10)+digit;
            x = x/10;
        }if(rev==orignal){
            return true;
        }else{
            return false;
        }
    }
}