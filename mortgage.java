import java.util.Scanner;
import java.lang.Math;
class mortgage{
  public static void main(String[] args){
    
    Scanner scanner= new Scanner(System.in);
    System.out.print("Enter the principal:");
    int principal = scanner.nextInt();
    System.out.print("Enter the Annual Rate:");
    float rate = scanner.nextFloat();
    System.out.print("Enter the Period:");
    int period = scanner.nextInt();
    int numberOfMonths=period*12;
    float m_rate = (rate/100)/12;
    double m=principal*(m_rate*Math.pow(1+m_rate,numberOfMonths))/(Math.pow(1+m_rate,numberOfMonths)-1);

    System.out.println("Your Mortgage Value Is: "+"$"+Math.round(m*100.0)/100.0);
  }

}