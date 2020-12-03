import java.util.Scanner;

public class Prob3  {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Print a number between 0-4: ");

    int grade = scan.nextInt();

    if (grade == 4){
      System.out.println("you got an A");
    }
    else if (grade == 3){
      System.out.println("you got an B");
    }
    else if (grade == 2){
      System.out.println("you got an C");
    }
    else if (grade == 1){
      System.out.println("you got an D");
    }
    else{
      System.out.println("you got an F");
    }




    
  }
}
