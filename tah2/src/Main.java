import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1 ve 7 arası sayı girin");
        int say =scanner. nextInt();
        System.out.println("girdiğiniz sayı " +" "+say);
        switch(say){
            default:
            System.out.println("hatalı giris");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            case 6:
                System.out.println("cuma");
            case 5:
                System.out.println("perşembe");
                break;
            case 4:
                System.out.println("çarşamba");
                break;
            case 3:
                System.out.println("salı");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 1:
                System.out.println("pazar");


            break;
        }

    }
}