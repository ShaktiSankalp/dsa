
import java.util.*;

public class Hashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //number hashing


        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // for(int i=0;i<size;i++){
        //     arr[i] = sc.nextInt();
        // }


        // int max = Integer.MIN_VALUE;
        // for (int num : arr) {
        //     if (num > max) max = num;
        // }

        // int numToFind = sc.nextInt();



        // int[] hash = new int[max+1];


        // for(int num : arr){
        //     hash[num]++;
        // }


        // System.out.println(hash[numToFind]);



        //character hashing

        String s = sc.next();
        char c = sc.next().charAt(0);
        int[] hash = new int[256];

        for(int i = 0;i<s.length();i++){
            char d = s.charAt(i);
            hash[d]++;
        }
        System.out.println(hash[c]);



        sc.close();


    }
}
