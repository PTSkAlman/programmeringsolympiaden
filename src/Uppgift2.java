import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv en mening med 1 till 5 ord");
        String ord = input.nextLine();
        int wordLength = ord.length();
        StringBuilder reverse = null;
        char[] charArray = new char[wordLength];
        for (int i = 0 ; i <= wordLength ; i++) {
            //charArray[i] = ord.charAt(i);
        }
        System.out.println(charArray);
    }
}


