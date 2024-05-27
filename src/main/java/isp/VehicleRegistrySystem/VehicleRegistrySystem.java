package isp.VehicleRegistrySystem;

import java.util.HashSet;
import java.util.Set;

public class VehicleRegistrySystem {
    Set<Vehicle> vehicles = new HashSet<>();

    public void addVehicle(Vehicle vehicle) {
        int k = 1;
        for (Vehicle v : vehicles)
            if (vehicles.contains(vehicle) || v.equals(vehicle)) {
                System.out.println("This vehicle already exists.");
                k = 0;
                break;
            }
        if (k == 1){
            vehicles.add(vehicle);
            System.out.println("The vehicle was added.");
        }
    }

    public void removeVehicle(String VIN)
    {
        int k = 1;
        for(Vehicle v: vehicles)
             if(v.getVIN() == VIN ) {
                 vehicles.remove(v);
                 k=0;
                 System.out.println("The vehicle was removed.");
                 break;
             }
        if(k==1)
            System.out.println("Vehicle with this VIN, doesn't exist.");
    }
    public boolean checkVIN(String VIN)
    {

        for(Vehicle v: vehicles)
           if(v.getVIN() == VIN)
              return true;
        return false;
    }
    public void displayVehicle()
    {
        System.out.println("The vehicles are:");
        for (Vehicle v : vehicles)
            System.out.println(v.toString());
    }
    public int noOfVehicles()
    {
        return vehicles.size();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("12121","HD10ARY", "masinuta", "Steel", 2020);
        Vehicle vehicle2 = new Vehicle("12","HDY", "mua", "Sel", 2022);
        VehicleRegistrySystem vehicleRegistrySystem = new VehicleRegistrySystem();
        vehicleRegistrySystem.addVehicle(vehicle);
        vehicleRegistrySystem.addVehicle(vehicle2);
        vehicleRegistrySystem.displayVehicle();
        vehicleRegistrySystem.removeVehicle("12121");
        vehicleRegistrySystem.displayVehicle();
        System.out.println(vehicleRegistrySystem.checkVIN("12"));
        System.out.println(vehicleRegistrySystem.checkVIN("12121"));






    }
}
