public class Mortgage_Calculator{
  private int principal;
  private float rate;
  public int numberOfMonths;

  public Mortgage_Calculator(int principal, float rate, int numberOfMonths){

    this.principal=principal;
    this.rate=rate;
    this.numberOfMonths=numberOfMonths;

  }

  public double calculate_mortgage(){

    double m=principal*(rate*Math.pow(1+rate,numberOfMonths))/(Math.pow(1+rate,numberOfMonths)-1);
    
      return m;
  }

  public double balance(int month){
     
     double bal=principal*(Math.pow((1+rate),numberOfMonths) -(Math.pow((1+rate),month)))/(Math.pow((1+rate),numberOfMonths)-1);

     return bal;
    
     
     
   }
  
}