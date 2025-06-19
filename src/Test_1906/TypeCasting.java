package Test_1906;

public class TypeCasting {
        public static void main(String[] args) {

            int intVal = 100;
            long longVal = intVal;
            float floatVal = longVal;

            System.out.println("Implicit Casting:");
            System.out.println("int value: " + intVal);
            System.out.println("long value (from int): " + longVal);
            System.out.println("float value (from long): " + floatVal);


            double doubleVal = 123.456;
            int castedInt = (int) doubleVal;

            System.out.println("\nExplicit Casting:");
            System.out.println("double value: " + doubleVal);
            System.out.println("int value (from double): " + castedInt);
        }
    }


