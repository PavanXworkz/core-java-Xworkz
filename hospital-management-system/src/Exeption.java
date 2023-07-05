public class Exeption {
  public static void main(String[] args) {
    System.out.println("main starts");
    try {
    method1();

    }catch(NumberFormatException nfe){
      nfe.printStackTrace();
      System.out.println("catch executed");
   }
    System.out.println("main ends");
 }
    
    private static void method1 ()throws NumberFormatException {
      System.out.println("method 1 started");
      method2();
      System.out.println("method 1 ended");
    }
    
    private static void method2 () throws NumberFormatException {
      System.out.println("method 2 started");
     // method3();
      System.out.println("method 2 ended");
    }
    
    private static void method3 () throws NumberFormatException {
      System.out.println("method 3 started");
      method3();
        String phno = "j";
        Long in = Long.parseLong(phno);
        System.out.println(phno);
      
      System.out.println("method 3ended");
      
    }
  }