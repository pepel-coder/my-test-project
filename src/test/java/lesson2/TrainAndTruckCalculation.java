package lesson2;

import org.junit.jupiter.api.Test;

public class TrainAndTruckCalculation {
    @Test

    public void usingObjects(){

        Train a = new Train();
        a.setTrainMark("Marky");
        a.setTrainNumber("18");
        a.setTrainConsumption(20);
        a.setTrainCopacity(2000);


        Train b = new Train();
        b.setTrainMark("Michel");
        b.setTrainNumber("28");
        b.setTrainConsumption(25);
        b.setTrainCopacity(24);

        Truck c = new Truck();
        c.setTruckMark("Volvo");
        c.setTruckNumber("K3040");
        c.setTruckConsumption(25);
        c.setTruckCopacity(24);

        Truck v = new Truck();
        v.setTruckMark("Volvo");
        v.setTruckNumber("K3140");
        v.setTruckConsumption(25);
        v.setTruckCopacity(24);

        Truck q = new Truck();
        q.setTruckMark("Scania");
        q.setTruckNumber("K3140");
        q.setTruckConsumption(23);
        q.setTruckCopacity(24);



        System.out.println( a.getTrainNumber()+" "+a.getTrainMark());
        System.out.println( b.getTrainNumber()+" "+b.getTrainMark());
        System.out.println( c.getTruckNumber()+" "+c.getTruckMark());
        System.out.println( v.getTruckNumber()+" "+v.getTruckMark());
        System.out.println( q.getTruckNumber()+" "+q.getTruckMark());
}
    private int sum(int a, int b){
        System.out.println("Firs digit is: "+ a +" and second digit: "+ b);
        int c= a + b;
        return c;
    }
}
