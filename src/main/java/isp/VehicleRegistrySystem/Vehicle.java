package isp.VehicleRegistrySystem;

import java.util.HashSet;

public class Vehicle {
    private String VIN;
   private String licencePlate;
   private String model;
   private String make;
   private int year;


   public Vehicle(String VIN, String licencePlate, String model, String make, int year)
   {
      this.VIN = VIN;
      this.licencePlate = licencePlate;
      this.make = make;
      this.model = model;
      this.year = year;

   }

   public int getYear()
   {
      return this.year;
   }
   public String getVIN()
   {
      return this.VIN;
   }
   public String getModel()
   {
      return this.model;
   }

   public String getLicencePlate()
   {
      return this.licencePlate;
   }
   public String getMake()
   {
      return this.make;

   }
   @Override
   public boolean equals(Object obj)
   {
      if(obj == null) return false;
      if(obj == this) return true;
      if(!(obj instanceof Vehicle)) return false;
      Vehicle vehicle = (Vehicle) obj;
      return this.VIN.equals(vehicle.getVIN());
   }

   @Override
   public int hashCode() {
      return VIN.hashCode();
   }

   @Override
   public String toString()
   {
      return "Vehicle's VIN: "+VIN+" licence plate: "+licencePlate+" model: "+model+" make: "+make+" year: "+year;
   }
    public static void main(String[] args)
    {
       Vehicle vehicle = new Vehicle("12121","HD10ARY", "masinuta", "Steel", 2020);
       System.out.println(vehicle.getMake());
       System.out.println(vehicle.getLicencePlate());
       System.out.println(vehicle.getYear());
       System.out.println(vehicle.getModel());
       System.out.println(vehicle.getVIN());
       System.out.println(vehicle.toString());
    }


}
