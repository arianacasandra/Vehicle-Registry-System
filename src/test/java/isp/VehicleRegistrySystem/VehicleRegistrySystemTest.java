package isp.VehicleRegistrySystem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleRegistrySystemTest {
    @Test
    public void TestVehicle()
    {
        Vehicle vehicle = new Vehicle("12121","HD10ARY", "masinuta", "Steel", 2020);

        String actual = vehicle.toString();
        String expected = "Vehicle's VIN: 12121 licence plate: HD10ARY model: masinuta make: Steel year: 2020";
        assertEquals("12121",vehicle.getVIN());
        assertEquals("HD10ARY",vehicle.getLicencePlate());
        assertEquals("masinuta",vehicle.getModel());
        assertEquals("Steel",vehicle.getMake());
        assertEquals(2020,vehicle.getYear());
        assertEquals(expected,actual );
    }

    @Test
    public void TestAddVehicle()
    {
        Vehicle vehicle = new Vehicle("12121","HD10ARY", "masinuta", "Steel", 2020);
        Vehicle vehicle2 = new Vehicle("12","HDY", "mua", "Sel", 2022);
        VehicleRegistrySystem vehicleRegistrySystem = new VehicleRegistrySystem();
        assertEquals(0,vehicleRegistrySystem.noOfVehicles());
        vehicleRegistrySystem.addVehicle(vehicle);
        assertEquals(1,vehicleRegistrySystem.noOfVehicles());
        vehicleRegistrySystem.addVehicle(vehicle2);
        assertEquals(2,vehicleRegistrySystem.noOfVehicles());
    }

    @Test
    public void TestRemoveVehicle()
    {
        Vehicle vehicle = new Vehicle("12121","HD10ARY", "masinuta", "Steel", 2020);
        Vehicle vehicle2 = new Vehicle("12","HDY", "mua", "Sel", 2022);
        VehicleRegistrySystem vehicleRegistrySystem = new VehicleRegistrySystem();
        assertEquals(0,vehicleRegistrySystem.noOfVehicles());
        vehicleRegistrySystem.addVehicle(vehicle);
        vehicleRegistrySystem.addVehicle(vehicle2);
        vehicleRegistrySystem.removeVehicle("12");
        assertEquals(1,vehicleRegistrySystem.noOfVehicles());
        vehicleRegistrySystem.removeVehicle("12121");
        assertEquals(0,vehicleRegistrySystem.noOfVehicles());
    }

    @Test
    public void TestCheck()
    {
        Vehicle vehicle = new Vehicle("12121","HD10ARY", "masinuta", "Steel", 2020);
        Vehicle vehicle2 = new Vehicle("12","HDY", "mua", "Sel", 2022);
        VehicleRegistrySystem vehicleRegistrySystem = new VehicleRegistrySystem();
        vehicleRegistrySystem.addVehicle(vehicle);
        vehicleRegistrySystem.addVehicle(vehicle2);
        assertEquals(true,vehicleRegistrySystem.checkVIN("12"));
        assertEquals(false,vehicleRegistrySystem.checkVIN("3"));
        assertEquals(true,vehicleRegistrySystem.checkVIN("12121"));



    }

}
