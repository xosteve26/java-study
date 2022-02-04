public class UIControl{
  private boolean isEnabled=true;

  public UIControl(boolean isEnabled){
    this.isEnabled=isEnabled;
    System.out.println("UI CONTROL");
  }
  
  public void enable(){
    isEnabled=true;
  }

  public void disaable(){
    isEnabled=false;
  }

  public boolean isEnabled(){
    return isEnabled;
  }
}