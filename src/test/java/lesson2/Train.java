package lesson2;

public class Train {
    private String trainMark;
    private String trainNumber;
    private int trainConsumption;
    private int trainCopacity;
    private int Mielage;
    private int PriceForTonn;

    public String getTrainMark() {
        return trainMark;
    }

    public void setTrainMark(String trainMark) {
        this.trainMark = trainMark;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String truckNumber) {
        this.trainNumber = truckNumber;
    }

    public int getTrainConsumption() {
        return trainConsumption;
    }

    public void setTrainConsumption(int trainConsumption) {
        this.trainConsumption = trainConsumption;
    }

    public int getTrainCopacity() {
        return trainCopacity;
    }

    public void setTrainCopacity(int trainCopacity) {
        this.trainCopacity = trainCopacity;
    }

    public void setMielage(int Mielage){this.Mielage=Mielage;}

    public int getMielage () {

        int a=(Mielage/100)*getTrainConsumption();
        return a;
    }
    public void setPriceForTonn(int fuelprice){this.PriceForTonn=fuelprice;}
    public double getPriceForTonn(){
      double price=getMielage()*PriceForTonn/getTrainCopacity();
      return price;
    }



}