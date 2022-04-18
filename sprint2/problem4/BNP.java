package sprint2.problem4;


import java.util.Scanner;

interface Denominationtype{
    public String paperSize();
}
class S1 implements Denominationtype{

    @Override
    public String paperSize() {
        return "S1";
    }
}
class S2 implements Denominationtype{

    @Override
    public String paperSize() {
        return "S2";
    }
}
class S3 implements Denominationtype{

    @Override
    public String paperSize() {
        return "S3";
    }
}
public class BNP {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Amount");
        int value=input.nextInt();

        Denominationtype type=(Factory.supplyType(value));

        System.out.println(type.paperSize());
    }
}
class Factory{
    public static Denominationtype supplyType( int money){
        if(money==10){
            return new S1();
        }
        else if(money==100){
            return new S2();
        }
        else if(money==1000){
            return new S3();
        }
        else{
            throw new IllegalArgument("Wrong Input");
        }

    }
}
class IllegalArgument extends RuntimeException{
    public IllegalArgument(String msg){
        super(msg);
    }
}