class Main {
  public static void main(String[] args) {
   sayHiHowAreYou(5);
   countBackwards(80);
  }

  public static void sayHiHowAreYou(int n) {
    if (n == 0) {
      System.out.println("Done!");
    } else {
      System.out.println("Hi!, How are you?");
      n--;
      sayHiHowAreYou(n);
    }
  }
  public static void countBackwards(int j){
   if (j == 0){
   System.out.println("Done!");
   }else{
   System.out.println(j);
   j--;
   countBackwards(j);
   }
  
  
  }




}

