import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.next();  // Reads the first word from input.txt
        System.out.println("Hello world " + firstWord);

        int a = 5;
        int b = 9;
        int min = (a > b) ? b : a;
        System.out.println(min);
        sc.close();
    }
}
