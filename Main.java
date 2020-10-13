/**
 *
 * @author 
 */
public class Main {


  public static void chaotic(int lines){
    //random number generator
    int randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
    //repeats each time i goes up until it reaches the number of lines (prints a new line at the end)
    for (int i = 1; i <= asterisks; i++){
      //prints an asterisk each time j increases
      for (int j = 1; j <= randNum; j++){
      System.out.print("*");
      randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
    }
    System.out.println();
    }
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //calls method
    chaotic(20);
  }
}
