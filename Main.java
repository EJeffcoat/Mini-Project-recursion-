class Main {
  public static void main(String[] args) {
    boatLaunch(5);
    finishLine(5);
  }
// The person is going over to 5 individual people and telling them to start their engines, and asking whether their ready to launch, as in to start the race. 
  public static void boatLaunch(int n) {
    if (n == 0) {
      System.out.println("Ready!");
      System.out.println("Set!");
      System.out.println("Go!");
    } else {
      System.out.println("Start your engines!");
      System.out.println("Are you ready to launch?");
      n--;
      boatLaunch(n);
   }
  }
  //This is the end of the race where people are going through the finish line, with the order of the people from first to last place. 
  public static void finishLine(int j){
    if (j==0){
      System.out.println("On the last lap, and the last leg of the race, here they come!");
      System.out.println("Ethan in first place, Gabe coming in second, Thomas in third, Christian in fourth, and Tommy in fifth!");
    }else{
      System.out.println("Ethan is crossing now!");
      System.out.println("Gabe is crossing now!");
      System.out.println("Thomas is crossing now!");
      System.out.println("Christian is crossing now!");
      System.out.println("Last, but not least, Tommy is finishing last!");
    }
  }
}