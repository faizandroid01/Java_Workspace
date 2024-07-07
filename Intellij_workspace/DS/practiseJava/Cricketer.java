package practiseJava;

public class Cricketer {
    int hundreds;
    String name;
    String city;

    public Cricketer(int hundreds, String name, String city){
        this.hundreds = hundreds;
        this.name = name;
        this.city = city;
    }

    public int getHundreds(){ return hundreds;}
    public String getName(){ return name;}
    public String getCity(){ return city;}

    public String toString(){
        return "hundreds: "+hundreds + ", name :" +name+ ", city:"+city;
    }

}