/* Super refers to the parent object. 
It is used to call super class methods,variables and also to access the super class constructor.*/

class A{
    int i = 1;
}
class B extends A {
    int i=2;
    public void m(){
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }
}
class superkeyword{
    public static void main(String[] args) {
        B b1 = new B();
        b1.m();
    }
}