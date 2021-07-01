import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber
{
    static void Instructions()//Instructions Functions
    {
        System.out.println("Instructions:- Computer will generate a random number and you have to gusses");
        try {
            Thread.sleep(5000);//Stoping program for 3 sec
        } catch (Exception e) {
            System.out.println();
        }
        System.out.println("Warning:- Enter a Number below 101 and don't Write any Alphabets Otherwise I will Restart Game!!");
        try {
            Thread.sleep(5000);//agian Stoping program for 3 sec
        } catch (Exception e) {
            System.out.println();
        }

    }
    static void generatingNumber(int value)//random number generating function
    {
        if(value==4)

        {
            System.out.println("\nShit! I Can't Restart it Anymore ");//if game has restarted 5 times it will exit
           try{
             Thread.sleep(2000);
           }
           catch(Exception e)
           {
             System.out.println();
           }
           System.out.println("\nI Have a new option");
           
            try{
             Thread.sleep(2000);
           }
           catch(Exception e)
           {
             System.out.println();
           }
            System.out.println("Exiting Game...");
                try {
                    Thread.sleep(5000);
                    System.out.println("Bye! Bye!");
                    System.exit(0);
                }
                catch(Exception t)
                {
                   System.out.println() ;
                }
                
        }else if(value == -1)
        {

            System.out.println("Please Wait Generating Number...");//Generating number
            try
            {
                Thread.sleep(3000);
                System.out.println("Number Generated!");
            }
            catch(Exception e)
            {
                System.out.println();
            }

        }
        else
        {
            System.out.println("Let me Restart This Game");//if users has entered any wrong thing it will restart
            try {
                Thread.sleep(2000);
            } catch (Exception w) {
                System.out.println();
            }
        }
    }


    static void loopProgram(int randomNumber,int errorNumber)//Main program includes numbers of guesses and ueser input
    {
        Scanner sc = new Scanner(System.in);
        Random loopRandom = new Random();//instance for Random
        int totalGuesses = 10;//total Guesses are 10
        int GuessedNo;
//        int error = 0;
        for(int guesses = 0 ; guesses != 10; )//loop dor 10 guesses
        {
            GuessedNo = 0;
            guesses++;//guesses used will increase at the starting of the loop
            totalGuesses--;//total guesses will decrease at the starting of loop
            System.out.print("Enter The Number That You Have Guessed:- ");
            try
            {
                GuessedNo = sc.nextInt();//ueser will guesses number
                if(GuessedNo>100)
                {
                      try {
                Thread.sleep(1000);
            } catch (Exception w) {
                System.out.println();
            
                

            
            throw new ArithmeticException("Let me Restart This Game");//Exception if user enter more than 100
}}}
            catch(InputMismatchException | ArithmeticException e)//if user enter any alphabet or more than 10 digit
            {

                int rand = loopRandom.nextInt(100);
                generatingNumber(errorNumber);//generating a number again
                loopProgram(rand, errorNumber +1);//running loop program again
            }
            if(GuessedNo == randomNumber)
            {
                System.out.print("You WIN!!      Number of Guess Used:- "+guesses+"\n               Number of Guesses Left:- "+totalGuesses+"\n\n");
                System.out.println("Thank You for Playing");
             System.out.println("Hope you enjoyed\nIf Yes than give One ⭐ 🤗");
                 
                break;
               // System.exit();
            }
            else
            {
                if(GuessedNo - randomNumber <=10&& GuessedNo - randomNumber>0)
                {
                    System.out.print("You Are Close  Number of Guess Used:- "+guesses+"\n               Number of Guesses Left:- "+totalGuesses+"\n\n");
                }

                else if(GuessedNo-randomNumber>=-10 && GuessedNo - randomNumber<0 )
                {
                    System.out.print("You Are Close  Number of Guess Used:- "+guesses+"\n               Number of Guesses Left:- "+totalGuesses+"\n\n");
                }
                else
                {
                    System.out.print("You Are Far    Number of Guess Used:- "+guesses+"\n               Number of Guesses Left:- "+totalGuesses+"\n\n");

                }
            }
            if(totalGuesses == 0)
            {
                System.out.print("YOU LOSE!      Number of Guess Used:- "+guesses+"\n               Number of Guesses Left:- "+totalGuesses+"\n\n");
               System.out.println("The Number is "+randomNumber);
                System.out.println("Thank You for Playing");
                System.out.println("Hope you enjoyed\nIf Yes than give One ⭐ 🤗");
                 System.exit(0);
              //  return;

            }
        }

    }
    public static void main(String [] args)
    {
        Random random = new Random();

        int rand = random.nextInt(100);
        Instructions();
        generatingNumber(-1);
        loopProgram(rand,0);
    }
}
