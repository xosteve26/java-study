import java.lang.Math;
class Main {

  public static void main(String[] args) {
    int principal=(int)Console.get_value("Enter Principal:",1000,1000000);
    float rate=(float)Console.get_value("Enter Rate: ",1,30);
    int period=(int)Console.get_value("Enter Period: ",1,30);
    
    
    var calculator=new Mortgage_Calculator(principal,rate,period);
    var report=new Mortgage_Report(calculator);
    report.display_mortgage();
    report.display_balance();
    
  }

  }