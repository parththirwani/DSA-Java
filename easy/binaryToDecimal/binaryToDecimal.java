package easy.binaryToDecimal;

public class binaryToDecimal {
    public static void main(String[] args) {
        System.out.println(convert(1101));
    }

    static int convert(int binary){
        int rem = 0;
        int power = 1;
        int dec = 0;

        if(binary ==0){
            return 0;
        }

        while(binary!=0){
            rem = binary %10;
            dec = dec+(rem*power);
            power = power*2;
            binary = binary/10;
        }
        return dec;
    }
}
