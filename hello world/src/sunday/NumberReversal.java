package sunday;

public class NumberReversal {
    public static void main(String[] args) {
        int number = 123456789;
        int reversingdNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversingdNumber = reversingdNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("reversingNumber: " + reversingdNumber);
        System.out.println("reversiNgNumber(x:100)");
    }
}




