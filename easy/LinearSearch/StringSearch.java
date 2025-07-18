package easy.LinearSearch;

import java.util.Scanner;

public class StringSearch {
    int search(String name, char target){
        for(int i=0; i<name.length(); i++){
            if(target == name.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string you want to search through: ");
        String name = sc.nextLine();

        System.out.print("Enter the char you want to search for: ");
        char ch = sc.next().charAt(0);

        StringSearch ss = new StringSearch();
        int index = ss.search(name, ch);
        System.out.println("The char "+ch+" is at "+index);
        sc.close();

    }

}
