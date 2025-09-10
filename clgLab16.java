public class clgLab16 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]); // Convert String to int
        }

        System.out.println("Sum of arguments: " + sum);
    }
}