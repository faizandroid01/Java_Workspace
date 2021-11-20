public class Regex {

    public static void main(String[] args) {

        String temp = "abc123   def456   ghi789 ";
        System.out.println("temp :"+ temp.replaceAll("\\s","*"));

        String temp1 = "abc123   def456   ghi789 ";
        System.out.println("temp1 :"+ temp1.replaceAll("\\s+","*"));

        String temp2 = "abc123   def456   ghi789 ";
        System.out.println("temp2 :"+ temp2.replaceAll("\\d","*"));

        String temp3 = "abc123   def456   ghi789 ";
        System.out.println("temp3 :"+ temp3.replaceAll("\\D","*"));

        String temp4 = "abc123   def456   ghi789 ";
        System.out.println("temp4 :"+ temp4.replaceAll("[0-5]","*"));

        String temp5 = "abc123   def456   ghi789 ";
        System.out.println("temp5 :"+ temp5.replaceAll("[a-e]","*"));

        String temp6 = "abc123   def456   ghi789 jkl91011., ";
        String pattern6 = "(\\w)(\\s+)|(\\.,)(\\s+)";
        System.out.println("temp6 :"+ temp6.replaceAll(pattern6,"*"));

        String temp7 = "abc123   def456   ghi789 jkl91011., ";
        String pattern7 = "((\\w)|(\\.,))(\\s+)";
        System.out.println("temp7 :"+ temp7.replaceAll(pattern7,"*"));

        String temp8 = "abc123   def456   ghi789 jkl91011., ";
        String pattern8 = "\\s+$";
        System.out.println("temp8 :"+ temp8.replaceAll(pattern8,"*"));
    }

}
