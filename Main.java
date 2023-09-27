import java.util.*;
/*İki array, ikisinin de 20 elementi olucak, bütün
elementler random verilicek, iki array karşılaştırıp
x arrayın de olup y elementinde olmayanlar yazılıcak ve tam tersi,
ve ikisinde de ortak olan elementler alınıcak.*/

public class Main {
    public static void main(String[] args) {
        Random a = new Random();
        int size =20;
        int[] array1 = new int[size];
        int[] array2 = new int[size];
for(int i =0;i<size;i++){
    array1[i]=a.nextInt(25);

}


        for(int i =0;i<size;i++){

            array2[i]=a.nextInt(25);

        }

        String firstArray = Arrays.toString(array1);
        System.out.println("Birinci dizi : " + firstArray);

        String secondArray = Arrays.toString(array2);
        System.out.println("İkinci dizi : " + secondArray);

        Set<Integer> Elements = new HashSet<>();

        for (int num1 : array1) {
            Elements.add(num1);
        }

        List<Integer> common = new ArrayList<>();
        List<Integer> unique2 = new ArrayList<>();
        List<Integer> unique1 = new ArrayList<>();
        for (int num : array2) {
            if (Elements.contains(num)) {
                common.add(num);
            }
            else {
                unique2.add(num);
            }
        }
        for (int number : array1) {
            if (!common.contains(number)) {
                unique1.add(number);
            }
        }
        System.out.println("Ortak Sayı : " + common);
        System.out.println("Birinci dizide olupta birinci dizide olmayan sayılar : " + unique1);
        System.out.println("İkinci dizide olupta birinci dizide olmayan sayılar : " + unique2);


    }
}