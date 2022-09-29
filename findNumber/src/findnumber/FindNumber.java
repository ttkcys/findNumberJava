package findnumber;

public class FindNumber {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0, 15, 36, 76, 2353, 657};
        int searchNumber = 3;
        boolean isExist = false;

        for (int number : numbers) {
            if (number == searchNumber) {
                isExist = true;
                break;
            }
        }
        if (isExist) {
            System.out.println("Number is exist");
        } else {
            System.out.println("Number is not exist");
        }
    }

}
