

interface Inter{
    public static final int x =10;
}
class NewFinterface implements Inter{
    public static void main(String[] args) {
        System.out.println(Inter.x);
    }
}