// case2 ->
// class P{
//     public void m1(){
//         System.out.println("Parent");
//     }
// }

// class C extends P{
//     public void m2(){
//         System.err.println("Child");
//     }
// }

// class Inh3{
//     public static void main(String[] args) {
//     P p = new C();
//     p.m1();
//     p.m2();
//     }
// }

//case3 -> Parents reference can use child reference but by using this reference we cannot call child specific methods.

//case4 -> Child reference cannot be used to hold the parent class object.
// class P{
//     public void m1(){
//         System.out.println("Parent");
//     }
// }

// class C extends P{
//     public void m2(){
//         System.err.println("Child");
//     }
// }

// class Inh3{
//     public static void main(String[] args) {
//     C c = new P();
//     c1.m1();
//     c2.m2();
//     }
// }