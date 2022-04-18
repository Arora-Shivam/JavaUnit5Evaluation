package sprint2.problem2;

class Bird {
    public void fly(){
        System.out.println("Flying..");
    };
}
class Pigeon extends Bird{
    @Override
    public void fly() {
        System.out.println("Pigeon can fly");
    }
}
class Ostrich extends Bird{
    //Subclass Not replaceable by base class we have to throw an error
    @Override
    public void fly(){
        throw new RuntimeException();
    }
}
//To avoid this
interface BirdWithLSP{};
interface FlyingBirdLSP extends BirdWithLSP {
    public void fly();
}
class PigeonLSP implements FlyingBirdLSP{

    @Override
    public void fly() {
        System.out.println("Pigeon Flying...");
    }
}
class OstrichLSP implements BirdWithLSP{

}