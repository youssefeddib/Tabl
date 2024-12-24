import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] nombres = new int[5];


        System.out.println("Veuillez entrer 5 nombres entiers :");

        for (int i = 0; i < 5; i++) {
            System.out.print("Entrez le nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextInt();
        }

        
        System.out.println("\nLes nombres dans l'ordre inverse sont :");
        for (int i = 4; i >= 0; i--) {
            System.out.println(nombres[i]);
        }


        scanner.close();
    }
}
