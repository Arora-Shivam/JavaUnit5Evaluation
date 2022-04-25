package Eval.Prob1;
//Using Strategy Pattern so that We can even add new platform with ease and there is minimum change in code if we have to do any
public class Demo {

        public static void main(String[] args) {
            // any social media strategy.
            SocialMediaContext context = new SocialMediaContext();

            // Setting Facebook strategy.
            context.setSocialmediaStrategy(new FacebookStrategy());
            context.connect("Lokesh");

            // Setting Twitter strategy.
            context.setSocialmediaStrategy(new TwitterStrategy());
            context.connect("Lokesh");

            // Setting GooglePlus strategy.
            context.setSocialmediaStrategy(new GooglePlusStrategy());
            context.connect("Lokesh");

            // Setting Orkut strategy.
            context.setSocialmediaStrategy(new OrkutStrategy());
            context.connect("Lokesh");

        }

}
class SocialMediaContext{
    SocialMeadia strategy;

    public void setSocialmediaStrategy(SocialMeadia strategy) {
        this.strategy = strategy;
    }

    public void  connect(String name){
        strategy.friend(name);
    }
}

interface  SocialMeadia{
    public void friend(String name);
}

class FacebookStrategy implements SocialMeadia{


    @Override
    public void friend(String name) {
        System.out.println("Connecting with "+name+" through Facebook");
    }
}


class GooglePlusStrategy implements SocialMeadia{


    @Override
    public void friend(String name) {
        System.out.println("Connecting with "+name+" through Google Plus");
    }
}

class OrkutStrategy implements SocialMeadia{


    @Override
    public void friend(String name) {
        System.out.println("Connecting with "+name+" through Orkut");
    }
}

class TwitterStrategy implements SocialMeadia{


    @Override
    public void friend(String name) {
        System.out.println("Connecting with "+name+" through Twitter");
    }
}
