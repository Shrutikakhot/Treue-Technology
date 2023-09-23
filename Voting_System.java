//Program for the Voting System
import java.util.Scanner;
//create class as Voting_System
class Voting_System
{
    public static void main(final String[] args) 
    {
         Scanner sc=new Scanner(System.in);
        int candidate1vote=0;
        int candidate2vote=0;

        System.out.println("** ** ** ** ** ** ** ** ** ** ** ");
        System.out.println(" ===Welcome to Voting_System===");
        System.out.println("** ** ** ** ** ** ** ** ** ** ** ");

        System.out.println("Enter your Name:");
        String name=sc.nextLine();

        System.out.println("Enter your Age:");
         int age=sc.nextInt();

        System.out.println("\nName is:" +name);
        System.out.println("Age is:" +age);
        //if age is less than 18
        if(age<18){
            System.out.println("Not are Not Eligible to vote!!");
            System.out.print("Thank You!!");
        }
        //else this will print
        else{
            System.out.println("\nEnter the candidate name to vote for:");
            System.out.println("============================");
            System.out.println("1.candidate 1");
            System.out.println("2.Candidate 2");
            System.out.println("============================");

            int vote=sc.nextInt();

            if(vote==1){ 
            candidate1vote++;
             System.out.println("You Voted For Candidate 1.");
             }
             else if(vote == 2){
            candidate2vote++;
            System.out.println("You Voted For Candidate 2.");
            }else{
                System.out.print("Invalid Candidate Selection.");
            }

            //prints the vote counts
            System.out.println("\n\nThe vote count for candidate 1 is:" +candidate1vote);
            System.out.println("The vote count for candidate 2 is:" +candidate2vote);
        }  
    }
}
