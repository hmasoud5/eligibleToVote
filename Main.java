class Main {
  public static void main(String[] args) {
    int age = 18;
    
    if (age < 18 && age <= 17 ){
      //if age is less than 18 you cannot vote
      System.out.println("You are old enough to vote");
    }else {
      System.out.println("You are too young to vote if age is...");
    }
    for (int a = 1; a < 18; a++){
      System.out.println(a + "");
    }
  }
}