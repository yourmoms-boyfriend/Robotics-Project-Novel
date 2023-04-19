import java.util.Scanner;

public class Maingame {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("I need to tell you something.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("Unfortunately, you have just died.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("It's nothing to panic about.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("Loads of people die everyday.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("But not every person who has died");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("is as lucky as you.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println(" ");

        System.out.println("Now...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("Tell me your name.");
        String input = scanner.nextLine();

        String name = input;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("Hmmm...so your name is " + name + "?");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println(""+ name + "...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("It rolls right off the tongue, doesn't it?");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("Well, " + name + " , your name won't matter unless you go back and...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("change your fate.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("This is your second chance. This time, try not to die.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("...Your body is sore.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("Your eyes open, the bright light from a nearby window blinding you for a few moments.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("\n???: " + name + "! You're finally awake!\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("You push yourself up to face whoever was talking to you.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("\n???: Wow, you look \033[3mawful.\033[0m\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("It was a man who looked to be in his early 20's.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("He had blonde hair and blue eyes, dawning a military uniform.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("\n???: What's wrong, " + name + "?");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("???: Did you hit your head or something?\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("[A] Ask him who he is.");
        System.out.println("[B] Act like you already know him.");
        
        input = scanner.nextLine();
 
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        if (input.toLowerCase().equals("a")){
            System.out.println("You ask the man if you knew him.");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 

            System.out.println("\n???: "+ name +", are you messing with me\n?");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 

            System.out.println("He chuckles breathily, but you stay silent, unsure of how to respond.");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 

            System.out.println("\n???: Alright, I'll humor you.");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 

            System.out.println("William: Soon to be infantryman, William Leandre.\n");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (input.toLowerCase().equals("b")){
            System.out.println("You smile awkwardly and try to put on your best casual act.");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n???: You've been sleeping all day, man.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("William: You poor pal William here had to make excuses for you all day.");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("William points to himself, using a dramatic tone in his voice.");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }


    }}