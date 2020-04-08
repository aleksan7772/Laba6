import java.util.Scanner;

public class PostOffice {
    private String[] PackageList;
    private double parcelWeight;
    private double parcelWidth;
    private double parcelHeight;

    public PostOffice(double parcelWeight, double parcelWidth, double parcelHeight) {
        this.parcelWeight = parcelWeight;
        this.parcelWidth = parcelWidth;
        this.parcelHeight = parcelHeight;
    }

    public double getParcelWeight() {
        return parcelWeight;
    }

    public void setParcelWeight(double parcelWeight) {
        this.parcelWeight = parcelWeight;
    }

    public double getParcelWidth() {
        return parcelWidth;
    }

    public void setParcelWidth(double parcelWidth) {
        this.parcelWidth = parcelWidth;
    }

    public double getParcelHeight() {
        return parcelHeight;
    }

    public void setParcelHeight(double parcelHeight) {
        this.parcelHeight = parcelHeight;
    }

    public String[] getPackageList() {
        return PackageList;
    }

    public void setPackageList(String[] packageList) {
        PackageList = packageList;
    }

    public static double volumeWeight(double parcelWeight, double parcelWidth, double parcelHeight) {
        return (parcelHeight * parcelWeight * parcelWidth) /4000;
    }
    public double volumeWeight() {
        return (this.parcelHeight * parcelWeight * parcelWidth) /4000;
    }

}