import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        int i=0;
        do {
            int eleman =1;
            System.out.print(eleman+". elemanı giriniz: ");
            int ele = scn.nextInt();
            arr[i]=ele;
            i++;

        }while(i<=size-1);
        Arrays.sort(arr);
        System.out.println("Sıralanan dizi: \n" +Arrays.toString(arr));
    }

}
