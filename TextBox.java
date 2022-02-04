public class TextBox extends UIControl{
  private String text="";
  
  public TextBox(){
    super(true); //should be the first line.
    System.out.println("TextBox");
  }
  @Override
  public String toString(){
    return text;
  }
  
  public void setText(String text){
    this.text=text;
  }

  public void clear(){
    text="";
  }

}