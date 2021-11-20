import java.util.*;
        import java.io.*;
        import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class NoSpoon {

    public static void calculateFor(int i, int j , List<String> inputList , int width , int height,int base){

        if(i>= height || j >= width){
            System.out.print("-1 -1 ");
            return ;
        }

        if(inputList.get(i).charAt(j) == '.' && base != 0 ){
            System.out.print("-1 -1 ");
            return ;
        }else if (inputList.get(i).charAt(j) == '.' && base ==0){
            return ;
        }

        System.out.print(j+" "+i+" ");

       // calculateFor(i,j+1,inputList,width,height,1);//right node
       // calculateFor(i+1,j,inputList,width,height,2);// bottom node

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        if (in.hasNextLine()) {
            in.nextLine();
        }
        List<String> listInput = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            listInput.add(line);
        }

        for(int i=0; i< height ; i++){
            for (int j =0; j< width; j++){

                if(listInput.get(i).charAt(j) != '.') {
                    NoSpoon.calculateFor(i, j, listInput, width, height, 0);
                    NoSpoon.calculateFor(i, j + 1, listInput, width, height, 1);//right Node
                    NoSpoon.calculateFor(i + 1, j, listInput, width, height, 2);//bottom Node
                    System.out.println();
                }
            }
        }

        }
}
