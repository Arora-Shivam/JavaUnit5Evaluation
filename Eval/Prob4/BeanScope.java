package Eval.Prob4;

public class BeanScope {
    //Singleton(Default)-if we use same bean id then it will return same object.
    //ex-Object obj1=ctx.getBean("square");
    //Object obj2=ctx.getBean("square");
    //obj1==obj2//true(i.e. both are same)


    //Prototype-if we use same bean id then it will return different object.
    //in property tage we have to change scope to prototype
    //ex-Object obj1=ctx.getBean("square");
    //Object obj2=ctx.getBean("square");
    //obj1==obj2//false(i.e. both are different)

}
