package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        count = 1;
//        while (true) {
//            if (count==6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        count = 6;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if(count>100) {
//                break;
//            }
//        } while(count!=6);

//       Below is the for loop alternative to the while loop:
//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }

        int num = 4;
        int finishNum = 20;
        int count = 0;

        while (num <= finishNum) {
            num++;
            if (!isEvenNumber(num)) {
                continue;
            }

            System.out.println("Even number " + num);

            count++;
            if (count >= 5) {
                break;
                }
            }
        System.out.println("Total number of even values is " + count);
        }

// Modify the while code above
// Make it also record the total number of even numbers it has found
// and break once 5 are found
// and at the end, display the total number of even numbers found

// Create a method called isEvenNumber that takes a param of type int
// Its purpose is to determine if the argument passed to the method is an even number or not
// return true if an even number, otherwise return false;

//    int num = 4;
//    int finishNum = 20;
//        while (num <= finishNum) {
//        num++;
//        if (!isEvenNumber(num)) {
//            continue;
//        }
//        System.out.println("Even number " + num);
//    }
}

    public static boolean isEvenNumber(int num) {
        return (num % 2 == 0) ? true : false;
    }

}
