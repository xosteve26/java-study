import java.util.Scanner;
import java.lang.Math;
class Main {

  public static void main(String[] args) {
    int principal=(int)get_value("Enter Principal:",1000,1000000);
    float rate=(float)get_value("Enter Rate: ",1,30);
    int period=(int)get_value("Enter Period: ",1,30);
    
    int numberOfMonths=period*12;
    float m_rate = (rate/100)/12;

    double m=principal*(m_rate*Math.pow(1+m_rate,numberOfMonths))/(Math.pow(1+m_rate,numberOfMonths)-1);
    
    display_mortgage(m);
    balance(principal, m_rate, numberOfMonths);
  }

  private static void display_mortgage(double mortgage){
    System.out.println("MORTGAGE");
    System.out.println("-----------");
    System.out.println("$"+Math.round(mortgage*100.0)/100.0);
    System.out.println();
  }


  public static double get_value(String sm,double value1, double value2){
    Scanner scanner= new Scanner(System.in);
    boolean validate=false;
    double main_value=0;
    validate=false;
    while(!validate){
      System.out.print(sm);
      main_value=scanner.nextDouble();
      if(main_value <value1 || main_value>value2){
        System.out.println("Enter a value between "+(int)value1+" and "+(int)value2);
        continue;
      }
      validate=true;
    }
    return main_value;
  } 
   public static void balance(int principal, float rate, int numberOfMonths){
     System.out.println("Remaining Balance");
     System.out.println("-----------------");
     int i=1;
     while(i<=numberOfMonths){
       double bal=principal*(Math.pow((1+rate),numberOfMonths) -(Math.pow((1+rate),i)))/(Math.pow((1+rate),numberOfMonths)-1);
     i+=1;
     System.out.println("$"+Math.round(bal*100.0)/100.0);

     }
     
   }

  }