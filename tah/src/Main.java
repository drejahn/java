import java.util.Scanner;
//kullanıcıdan 1-7 arasında rakam alınacak
// ve girdiği rakama gelen haftanın günü yazacağız.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

String day;

System.out.println("Lutfen 1 ve 7 arası sayı girin");
        int say =scanner. nextInt();
        System.out.println("girdiğiniz sayı " +" "+say);
        if (say==1){
            System.out.println("pazar");
        }
        if (say==2){
            System.out.println("pazartesi");
        } if (say==3){
            System.out.println("salı");
        } if (say==4){
            System.out.println("çarşamba");
        } if (say==5){
            System.out.println("perşembe");
        } if (say==6){
            System.out.println("cuma");
        } if (say==7){
            System.out.println("cumartesi");
        } else  {
            System.out.println("hatalı giris");

        }


    }
}