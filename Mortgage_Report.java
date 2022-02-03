public class Mortgage_Report{

  private Mortgage_Calculator calculator;
  
  public Mortgage_Report(Mortgage_Calculator calculator){
    this.calculator=calculator;
  }
  
  public void display_mortgage(){
    double mortgage=calculator.calculate_mortgage();
    System.out.println("MORTGAGE");
    System.out.println("-----------");
    System.out.println("$"+Math.round(mortgage*100.0)/100.0);
    System.out.println();
  }

  public void display_balance(){
    System.out.println("Remaining Balance");
    System.out.println("-----------------");
    int month=1;
    while(month<=calculator.numberOfMonths){
      double balance=calculator.balance(month);
      System.out.println("$"+Math.round(balance*100.0)/100.0);
      month+=1;
     
     }
    
  }
   
}