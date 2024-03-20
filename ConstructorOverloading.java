public class ConstructorOverloading {
    private int value;

    public ConstructorOverloading() {
        this.value = 0;
    }

    public ConstructorOverloading(int value) {
        this.value = value;
    }

    public ConstructorOverloading(int a, int b) {
        this.value = a + b;
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
        ConstructorOverloading obj3 = new ConstructorOverloading(5, 7);

        System.out.println("Value of obj1: " + obj1.getValue());
        System.out.println("Value of obj2: " + obj2.getValue());
        System.out.println("Value of obj3: " + obj3.getValue());
        System.out.println("Name: Vedant Solanki " + "\n" + "SAP ID: 500121550");

    }

    public int getValue() {
        return this.value;
    }
}
