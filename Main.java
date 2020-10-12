import java.util.Scanner;

class Main {
  public static void main(String[] args){
    int age = 17;
    
    if (age < 18 && age != 18 ){
      System.out.println("You are not eligble to vote if age is...");
      //You are too young to vote if the if statement says age is less than 18 or less than or equal to 17
      for (int a = 1; a < 18; a++){
      //Ages 1 to 17 cannot vote since if else statement printed "You are too young to vote if age is"
      System.out.print(a + ",");
      //age will accelerate to the number 17
     
    }
    }else {
      //if age is less than 18 you cannot vote
      //AND if age is less than or equal to 17 you still cannot vote
      System.out.println("You are eligble to vote");
      //You are old enough to vote if you are 18 or older
    }
  }
}