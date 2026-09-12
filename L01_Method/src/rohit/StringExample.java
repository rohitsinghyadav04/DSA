package rohit;

public class StringExample {
    public static void main(String[] args) {
//        String message =greet();
//        System.out.println(message);
        String personalized = myGreet("Rohit Singh ");
        System.out.println(personalized);

    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


    static String greet(){
        String greeting = "How are you";
        return greeting;
    }
}
