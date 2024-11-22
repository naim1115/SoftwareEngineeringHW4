import com.softwareengineeringhw4.CarFactory;
import com.softwareengineeringhw4.ShareableCar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarFactoryTest {

    @Test
    public void testCreateNormalCar() {
        CarFactory factory = new CarFactory();
        ShareableCar normalCar = factory.createCar("normal");

        // Verify features and fee
        assertNotNull(normalCar, "Normal car should not be null");
        assertEquals(10.0, normalCar.calculateFee(), "Normal car fee should be $10.0");
    }

    @Test
    public void testCreateLuxuryCar() {
        CarFactory factory = new CarFactory();
        ShareableCar luxuryCar = factory.createCar("luxury");

        // Verify features and fee
        assertNotNull(luxuryCar, "Luxury car should not be null");
        assertEquals(25.0, luxuryCar.calculateFee(), "Luxury car fee should be $25.0");
    }

    @Test
    public void testCreateSUVCar() {
        CarFactory factory = new CarFactory();
        ShareableCar suvCar = factory.createCar("suv");

        // Verify features and fee
        assertNotNull(suvCar, "SUV car should not be null");
        assertEquals(20.0, suvCar.calculateFee(), "SUV car fee should be $20.0");
    }

    @Test
    public void testCreateWheelchairAccessibleCar() {
        CarFactory factory = new CarFactory();
        ShareableCar wheelchairCar = factory.createCar("wheelchair");

        // Verify features and fee
        assertNotNull(wheelchairCar, "Wheelchair Accessible car should not be null");
        assertEquals(15.0, wheelchairCar.calculateFee(), "Wheelchair Accessible car fee should be $15.0");
    }

    @Test
    public void testInvalidCarType() {
        CarFactory factory = new CarFactory();

        // Expect an IllegalArgumentException for an invalid car type
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.createCar("unknown");
        });

        // Verify exception message
        assertEquals("Unknown car type: unknown", exception.getMessage());
    }
}