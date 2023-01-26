import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ass or tits bro?");
        System.out.println("[A] Ass");
        System.out.println("[B] Tits");

        String input = scanner.nextLine();

        // This is how u code in delays
        // The 7000 is in milliseconds.
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  
        
        if (input.toLowerCase().equals("a")){
            System.out.println("Bro what? You're so basic.");
        }

        if (input.toLowerCase().equals("b")){
            System.out.println("ME TOO BROOO!!");
        }

        if (input.toLowerCase().equals("personality")){
            System.out.println("Shut yo goofy ass up");

        }

    }
}
