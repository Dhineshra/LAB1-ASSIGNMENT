import java.util.ArrayList;
import java.util.Scanner;

class qseven {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        int nums = num;
        boolean result = checkNumber(num);
        if (result) {
            System.out.println(nums + " is an increasing number");
        } else {
            System.out.println(nums + " is not an increasing number");
        }
        scan.close();
    }

    static boolean checkNumber(int num) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (num != 0) {
            int d = num % 10;
            arr.add(d);
            num = num / 10;
        }
        int flag = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) >= arr.get(i + 1)) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }

    }
}