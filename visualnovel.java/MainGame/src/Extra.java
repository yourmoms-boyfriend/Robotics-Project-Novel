import java.util.Scanner;

public class Extra {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ass or tits bro?");
        System.out.println("[A] Ass");
        System.out.println("[B] Tits");

        String input = scanner.nextLine();

        
        if (input.toLowerCase().equals("a")){
            System.out.println("Bro what? You're so basic.");
        }

        if (input.toLowerCase().equals("b")){
            System.out.println("ME TOO BROOO!!");
        }

    }
}
