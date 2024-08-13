package lambda;


interface Calculator {
//    void Switchon();
  /*  void sum(int input);*/
    int subtract(int a, int b);
}

public class Calculatorimpl {

    public static void main(String[] args) {
//        Calculator c = ()-> {
//            System.out.println("Switching on");
//        };
//        c.Switchon();

//        Calculator calculator=(input)-> System.out.println("Sum : " +input);
//        calculator.sum(5);

       Calculator calculator= (a,b)-> {
           if(b<a){
              throw new RuntimeException("b is less than a");
           }else {
               return b - a;
           }
       };
       System.out.println(calculator.subtract(100,50));
    }
}
