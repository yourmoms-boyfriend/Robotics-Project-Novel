import java.util.Scanner;

public class Extra {

    public static void main(String[] args){

            System.out.println("Yo wsp");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  

        Scanner scanner = new Scanner(System.in);

        System.out.println("u wanna start the game bro?");
        System.out.println("yes");
        System.out.println("no");

        String input = scanner.nextLine();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  
        
        if (input.toLowerCase().equals("yes")){
            System.out.println("Ok then lets start lol");
        }

        if (input.toLowerCase().equals("no")){

            System.out.println("...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(".....");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("let's start lol");
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        System.out.println("\033[3mOnce upon a time uhh.\033[0m");
    }
}
}}