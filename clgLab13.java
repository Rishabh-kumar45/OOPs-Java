public class clgLab13{
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                count = count + 1;
                sum = sum + i;
            }
        }
        System.out.println("Count is " + count);
        System.out.println("Sum is " + sum);
    }
}