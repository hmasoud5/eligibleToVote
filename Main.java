class Main {
  public static void main(String[] args) {
    int age = 18;
    
    if (age < 18 && age <= 17 ){
      //if age is less than 18 you cannot vote
      //AND if age is less than or equal to 17 you still cannot vote
      System.out.println("You are old enough to vote");
      //You are old enough to vote if you are 18 or older
    }else {
      System.out.println("You are too young to vote if age is...");
    }
    for (int a = 1; a < 18; a++){
      System.out.println(a + "");
    }
  }
}