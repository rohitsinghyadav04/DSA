package rohit.conditionals;

public class Conditionals {
    public static void main(String[] args) {
        /*
        Syntax of if statement

         */
        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 2000;
        }
        else {
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}
