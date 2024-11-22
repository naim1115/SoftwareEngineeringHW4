import com.softwareengineeringhw4.LegacyReservation;
import com.softwareengineeringhw4.ReservationAdapter;
import com.softwareengineeringhw4.ReservationSystem;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationAdapterTest {

    @Test
    public void testAdapterIntegration() {
        // Setup legacy reservation system
        LegacyReservation legacyReservation = new LegacyReservation();

        // Create adapter
        ReservationSystem adapter = new ReservationAdapter(legacyReservation);

        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Use the adapter to reserve
        adapter.reserve();

        // Verify the output matches legacy reservation behavior
        assertEquals("Reserving a car using legacy system.\n", outputStream.toString());
    }
}