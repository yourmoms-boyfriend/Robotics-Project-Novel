import java.util.Scanner;

public class Maingame {
    public static Scanner in = new Scanner(System.in);
    public static String question;

    public static void main (String[] args)
    {
        question = "0";
        //Game loop
        while (true)
        {
            //Handles story
            switch(question) //if question is equal to...
            {
            case "0": //...this right here
                System.out.println("You groaned as you awakened in something.\nWhat is this, a large test tube? The glass was broken and you felt groggy, hungover like you had knocked yourself out with a few drinks the night before.\nYou sit up and slowly climb out of the test tube, careful not cut yourself on the broken glass.\nThe room outside of the tube seemed to be a lab of some sort, but it was messy.\nShattered glass tubes littered the floor along with paper and broken furniture.\nYou look at the large test tube you were lying in.\nThere was a control panel next to it and when you touched it, it flickered to life with a few flashes of white.\nClone ID:B334H6D\nClone ID? What did that mean? The words below it list your name.\nWhat is your name? ");
                question = "1";
                break;

            
            }
        }
    }
}
