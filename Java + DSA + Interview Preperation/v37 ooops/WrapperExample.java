public class WrapperExample {
    public static void main(String[] args) {
       //variable of primitive type
         int a=10;
         int c = 20;
         swap(a, c);
         //it will not swap as they are primitives and in java there is no such thing as pass by reference
         System.out.println(a + " "+ c);
        //object of wrapper class
        //  Integer b=60;
         //sameif we take object of wrapper class it will not swap as well
         //because the class Integer is final
        //  final int j = 90;
       //  j=100; //error

        // for(int i=0;i<100000000;i++){
        //     new A("janvi");
        // }
        System.gc();
}
static void swap(int x,int y){
    int temp=x;
    x=y;
    y=temp;
}
    class A{
        String name;
        public A(String name){
            this.name=name;
        }
        //when the object is destroyed the finalize method is called
        @Override
        protected void finalize() throws Throwable {
            System.out.println("element  destroyed ");
        }
    }
}