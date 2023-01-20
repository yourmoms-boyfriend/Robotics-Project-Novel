import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("Ass or tits bro?");
        System.out.println("[A] Ass");
        System.out.println("[B] Tits");

        
        if (input.equals("A")){
            System.out.println("I'm more of an ass guy.");
        }

        if (input.equals("B")){
            System.out.println("I prefer tiddies lol");
        }

    }
}
