package sprint2.problem3;
//Given Code violate Liskov solid pinciple
//Fixing the given code according to SOLID principles->

public class Main {
}
interface DataManager{

}
interface DataManagerWithRead extends DataManager{
    public void read();
}
interface DataManagerWithWrite extends DataManager{
    public void write();
}

class DiskRealmManager implements DataManagerWithRead,DataManagerWithWrite{

    @Override
    public void read() {
        System.out.println("Reading DiskRealmManager");
    }

    @Override
    public void write() {
        System.out.println("Saving to Realm");
    }
}

class DiskCoreDataManager implements DataManagerWithRead,DataManagerWithWrite{

    @Override
    public void read() {
        System.out.println("Reading DiskCoreDataManager");
    }

    @Override
    public void write() {
        System.out.println("Saving to DiskCoreDataManager");
    }
}

class InMemoryRealmManager implements DataManagerWithRead{

    @Override
    public void read() {
        System.out.println("Reading InMemoryRealmManager");
    }


}