class MyClass {
    private int data1;
    private String data2;

    public void setData(int d1, String d2) {
        data1 = d1;
        data2 = d2;
    }

    public void getData() {
        System.out.println("Data1: " + data1);
        System.out.println("Data2: " + data2);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.setData(10, "Hello");

        obj.getData();
    }
}
