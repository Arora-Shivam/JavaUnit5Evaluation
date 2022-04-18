package sprint2.problem4;

enum PaperSize{
    S1,S2,S3;
}
interface Denominationtype{

}
class 
public class BNP {

    public static void main(String[] args) {
        System.out.println(Factory.supplyType(100));
    }
}
class Factory{
    public static PaperSize supplyType( int money){
        if(money==10){
            return PaperSize.valueOf("S1");
        }
        else if(money==100){
            return PaperSize.valueOf("S2");
        }
        else{
            return PaperSize.valueOf("S3");
        }
    }
}