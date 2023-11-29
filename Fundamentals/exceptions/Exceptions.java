package exceptions;

/**
 * Exceptions
 */
public class Exceptions {

  public static void main(String[] args){
    try {
        validateNumber();
    } catch (Exception e) {
          System.out.println("Deu ruim");
          e.printStackTrace();
    }
  
  }

  public static void validateNumber() throws Exception {
     int number = 10;
      if(number < 100) {
        throw new Exception("Number must be greater than 100");
      }

  }
  
}