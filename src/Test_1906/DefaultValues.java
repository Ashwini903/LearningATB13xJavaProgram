package Test_1906;

public class DefaultValues {
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;

    public void printDefaults() {
        System.out.println("Default values of primitive data types:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: [" + charVar + "]");
        System.out.println("boolean: " + booleanVar);
    }

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        obj.printDefaults();
    }
}


