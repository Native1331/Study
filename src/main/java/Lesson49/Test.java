package Lesson49;

public class Test {
    public static void main(String[] args) {
    //    someMethod();
        counter(3);
    }
   // private static void someMethod(){
   //     System.out.println("Hello");
    //    someMethod();//метод исполняется по новой
       //counter(3)-counter(2)-counter(1)
        private static void counter(int n) {
            if (n == 0)
                return;
            System.out.println(n);

          counter(n-1);
//counter(3) не закончен ждет, когда закончится counter(2),
// counter(2) не закончен ждет, когда закончится counter(1),
//counter(1) не закончен ждет, когда закончится counter(0),  всё закончится.
    }
}
