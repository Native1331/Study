package Lesson49;

public class Test1 {
    public static void main(String[] args) {
        /* 4!=4*3*2*1
        1!=1
        15!=15*14*13...1
        0!=1
         */
        System.out.println(fac(4));
            }
            //fac(4)
    // 4*6
    // 3*2
    // 2*1
    // fac1
            private static int fac(int n){
        if(n==1)
            return 1;
        return n*fac(n-1);
            }
}
