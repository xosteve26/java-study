import java.lang.Math;
class Main {

  public static void main(String[] args) {
    int principal=(int)Console.get_value("Enter Principal:",1000,1000000);
    float rate=(float)Console.get_value("Enter Rate: ",1,30);
    int period=(int)Console.get_value("Enter Period: ",1,30);
    
    int numberOfMonths=period*12;
    float m_rate = (rate/100)/12;

    var calculator=new Mortgage_Calculator(principal,m_rate,numberOfMonths);
    var report=new Mortgage_Report(calculator);
    report.display_mortgage();
    report.display_balance();
    
  }

  

  

  }