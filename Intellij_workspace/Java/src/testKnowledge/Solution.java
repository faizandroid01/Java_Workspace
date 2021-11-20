package testKnowledge;

public class Solution {
    public static void main(String[] args) {
        Small small = new Small();
        small.a=1;
        small.print();
    }
}

class Big{
    int a ;
    String x = "Big";
    void print() {
        System.out.println(a+x);
    }
}

class Small extends Big{
    int a;
    String x = "Small";

//    @Override
//    public void print() {
//        super.print();
//        System.out.println(a+x);
//    }

//    void print() {
//        System.out.println(a+x);
//    }


//    void print(){
//        super.print();
//        System.out.println(a+x);
//    }


}