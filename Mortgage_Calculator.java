public class Mortgage_Calculator{
  private int principal;
  private float rate;
  private int numberOfMonths;

  public Mortgage_Calculator(int principal, float rate, int period){

    this.principal=principal;
    this.rate=(rate/100)/12;
    this.numberOfMonths=period*12;

  }

  public double calculate_mortgage(){

    double m=principal*(rate*Math.pow(1+rate,numberOfMonths))/(Math.pow(1+rate,numberOfMonths)-1);
    
      return m;
  }

  public double[] balance(){
    var balances=new double[numberOfMonths];
    int month=1;
    while(month<=numberOfMonths){
      double bal=principal*(Math.pow((1+rate),numberOfMonths) -(Math.pow((1+rate),month)))/(Math.pow((1+rate),numberOfMonths)-1);
      balances[month-1]=(Math.round(bal*100.0)/100.0);
      month+=1;
     
     }
     
     return balances;
     
   }
  
}