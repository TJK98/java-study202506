package chap1_3;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle grandeur = new Vehicle("현대", "그랜저");
        Vehicle panamera = new Vehicle("몰라", "외제차");

        grandeur.powerOn();

        System.out.println("grandeur = " + grandeur);
        System.out.println("panamera = " + panamera);
    }
}
