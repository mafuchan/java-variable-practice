class App {
  public static void main(String args[]) {
    String message = "Vehicle Information";
    Integer vin = 1231234;
    String make = "Ford";
    String model = "F150";
    String color = "Gray";
    Boolean towingPackage = false;
    Integer odometer = 456;
    Integer price = 45000;
    String qualityRating = "B";

    StringBuilder vehicleInfo = new StringBuilder();
    vehicleInfo.append(message);
    vehicleInfo.append(": VIN-" + vin);
    vehicleInfo.append("- MAKE/MODEL-" + make);
    vehicleInfo.append(":" + model);
    vehicleInfo.append(" COLOR-" + color);
    vehicleInfo.append(" TOWING PKG- " + towingPackage);
    vehicleInfo.append(" ODOMETER- " + odometer);
    vehicleInfo.append(" PRICE- $" + price);
    vehicleInfo.append(" QUALITY RATING- " + qualityRating);

    System.out.println(vehicleInfo);
  }
}
