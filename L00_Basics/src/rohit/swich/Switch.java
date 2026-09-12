package rohit.swich;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        System.out.println("Enter fruit name");
//        String fruit = in.next();
////        if(fruit.equals("mango")) {
////            System.out.println("King of fruits");
////        }
////        if(fruit.equals("apple")) {
////            System.out.println("A sweet red fruit");
////        }
//
//        switch (fruit) {
//            case "mango":
//                System.out.println("King of fruits");
//                break;
//                case "apple":
//                    System.out.println("a sweet red fruit");
//                    break;
//                    case "orange":
//                        System.out.println("round fruit");
//                        break;
//                        case "grapes":
//                            System.out.println("small fruit");
//            default:
//                    System.out.println("Invalid fruit name");
//        }


          int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.print("Weekends");
        }

    }
}
