import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ange ytvikten för kuvertet:");
        double kuvert = input.nextDouble();
        System.out.println("Ange ytvikten för affischen:");
        double affisch = input.nextDouble();
        System.out.println("Ange ytvikten för bladet:");
        double blad = input.nextDouble();

        double kuvertVikt = 2*kuvert*0.074196;
        double affischVikt = 2*affisch*0.12474;
        double bladVikt = blad*0.06237;

        double sum = kuvertVikt+affischVikt+bladVikt;

        System.out.println("Totalvikten är: " + sum);
    }
}
