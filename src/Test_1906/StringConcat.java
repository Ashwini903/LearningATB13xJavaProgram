package Test_1906;

public class StringConcat {
        public static void main(String[] args) {
            int test1 = 40;
            int test2 = 20;
            String text = "Result: ";


            System.out.println(test1 + test2);
            System.out.println(text + test1 + test2);
            System.out.println(text + (test1 + test2));

    }
}
