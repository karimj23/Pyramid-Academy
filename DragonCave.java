package src;
import java.util.Scanner;
public class DragonCave {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2)");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num ==1){
            System.out.println("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    "Gobbles you down in one bite!");
        }else if(num ==2){
            System.out.println("You approach the cave...\n" +
                    "You find gold and diamonds...\n");
        }else{
            System.out.println("Please try again!");
        }
    }}
/// Questions for this assignment
//Are dragons really real for real?
//Answer No!
//How does one get input from the player?
//Scanner scan = new Scanner(System.in)