// John Doe

public class Main 
{
  
  public static void main(String[] args) 
  {
    //System.out.println("hello world");
    //sayHello();
    Chatbot siri = new Chatbot();
    siri.sayHello();
  }
  
  // behaviors
  public static void sayHello()
  {
    System.out.println("Hi!");
  }

  
}

//////////////////////////////////////////////////////////

class Chatbot
{
    // state (properties)
    private String myAccent;
    private int myVolume;
    
    public Chatbot()
    {
      myAccent = "English";
      myVolume = 5;
    }
    
    // behaviors (methods)
    public void sayHello()
    {
      System.out.println("Hi there! " + myVolume);
    }

}
