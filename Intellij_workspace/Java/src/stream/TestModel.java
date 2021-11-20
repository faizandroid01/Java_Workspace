package stream;

public class TestModel {

    int value ;
    String name;
    boolean check;
    double price;

    public TestModel(int value, String name, boolean check, double price) {
        this.value = value;
        this.name = name;
        this.check = check;
        this.price = price;
    }

    public TestModel() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TestModel{" +
                "value=" + value +
                ", name='" + name + '\'' +
                ", check=" + check +
                ", price=" + price +
                '}';
    }
}
