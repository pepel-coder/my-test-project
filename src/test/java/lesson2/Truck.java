package lesson2;

public class Truck {
    private String truckMark;
    private String truckNumber;
    private int truckConsumption;
    private int truckCopacity;
    private int Mielage;
    private int PriceForTonn;

    public String getTruckMark() {
        return truckMark;
    }

    public void setTruckMark(String truckMark) {
        this.truckMark = truckMark;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber;
    }

    public int getTruckConsumption() {
        return truckConsumption;
    }

    public void setTruckConsumption(int truckConsumption) {
        this.truckConsumption = truckConsumption;
    }

    public int getTruckCopacity() {
        return truckCopacity;
    }

    public void setTruckCopacity(int truckCopacity) {
        this.truckCopacity = truckCopacity;
    }
    public void setMielage(int Mielage){this.Mielage=Mielage;}

    public int getMielage () {
        int fuel= (Mielage/100)*getTruckConsumption();
        return fuel;
    }
    public void setPriceForTonn(int fuelprice){this.PriceForTonn=fuelprice;}
    public double getPriceForTonn(){
        double price=getMielage()*PriceForTonn/getTruckCopacity();
        return price;
    }
}
