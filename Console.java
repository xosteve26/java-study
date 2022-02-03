import java.util.Scanner;

public class Console{
  public static Scanner scanner=new Scanner(System.in);
  
  public static double get_value(String prompt,double value1, double value2){
    boolean validate=false;
    double main_value=0;
    validate=false;
    while(!validate){
      System.out.print(prompt);
      main_value=scanner.nextDouble();
      if(main_value <value1 || main_value>value2){
        System.out.println("Enter a value between "+(int)value1+" and "+(int)value2);
        continue;
      }
      validate=true;
    }
    return main_value;
  } 
  
}