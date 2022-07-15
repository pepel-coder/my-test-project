package lesson2;

import org.junit.jupiter.api.Test;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.List;


public class TrainAndTruckCalculation {
    @Test

    public void usingObjects(){

        Train a = new Train();
        a.setTrainMark("Marky");
        a.setTrainNumber("18");
        a.setTrainConsumption(35);
        a.setTrainCopacity(60);


        Train b = new Train();
        b.setTrainMark("Michel");
        b.setTrainNumber("28");
        b.setTrainConsumption(30);
        b.setTrainCopacity(40);

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

        a.setMielage(2000);
        b.setMielage(2000);
        c.setMielage(2000);
        v.setMielage(2000);
        q.setMielage(2000);
        a.setPriceForTonn(2);
        b.setPriceForTonn(2);
        c.setPriceForTonn(2);
        v.setPriceForTonn(2);
        q.setPriceForTonn(2);


            System.out.println(a.getTrainNumber() + " " + a.getTrainMark());
            System.out.println(b.getTrainNumber() + " " + b.getTrainMark());
            System.out.println(c.getTruckNumber() + " " + c.getTruckMark());
            System.out.println(v.getTruckNumber() + " " + v.getTruckMark());
            System.out.println(q.getTruckNumber() + " " + q.getTruckMark());
        System.out.println("Паравоз " + a.getTrainMark() +" при 2000 км потребляет =" + a.getMielage()+" литров");
        System.out.println("Паравоз " + b.getTrainMark() +" при 2000 км потребляет =" + b.getMielage()+" литров");
        System.out.println("Машина " + c.getTruckMark() +" при 2000 км потребляет =" + c.getMielage()+" литров");
        System.out.println("Машина " + v.getTruckMark() +" при 2000 км потребляет =" + v.getMielage()+" литров");
        System.out.println("Машина " + q.getTruckMark() +" при 2000 км потребляет =" + q.getMielage()+" литров");
        System.out.println("У паровоза " + a.getTrainMark() +" перевозка 1 тонны груза стоит =" + a.getPriceForTonn()+" евро");
        System.out.println("У паровоза " + b.getTrainMark() +" перевозка 1 тонны груза стоит =" + b.getPriceForTonn()+" евро");
        System.out.println("У паровоза " + c.getTruckMark() +" перевозка 1 тонны груза стоит =" + c.getPriceForTonn()+" евро");
        System.out.println("У паровоза " + v.getTruckMark() +" перевозка 1 тонны груза стоит =" + v.getPriceForTonn()+" евро");
        System.out.println("У паровоза " + q.getTruckMark() +" перевозка 1 тонны груза стоит =" + q.getPriceForTonn()+" евро");



        System.out.println("Наилучшая цена за 1 тонну "+ Math.min(Math.min(Math.min(a.getPriceForTonn(), b.getPriceForTonn()),c.getPriceForTonn()),q.getPriceForTonn())+" евро");



             }
    //public int Mielege ( int distance) {int Mielage= distance/a.getTrainConsumption();return Mielage; }

    private int sum(int a, int b){
        System.out.println("Firs digit is: "+ a +" and second digit: "+ b);
        int c= a + b;
        return c;
    }
}
