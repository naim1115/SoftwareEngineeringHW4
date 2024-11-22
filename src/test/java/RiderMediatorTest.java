import com.softwareengineeringhw4.MessageMediator;
import com.softwareengineeringhw4.Rider;
import com.softwareengineeringhw4.RiderObserver;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class RiderMediatorTest {

    @Test
    public void testMediatorMessageBroadcast() {
        // Set up output stream to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create mediator
        MessageMediator mediator = new MessageMediator();

        // Create observers
        RiderObserver rider1 = new RiderObserver("Rider 1");
        RiderObserver rider2 = new RiderObserver("Rider 2");
        RiderObserver rider3 = new RiderObserver("Rider 3");

        // Add observers to the mediator
        mediator.addObserver(rider1);
        mediator.addObserver(rider2);
        mediator.addObserver(rider3);

        // Create a rider and send a message
        Rider broadcaster = new Rider(mediator);
        broadcaster.postMessage("New ride available!");

        // Expected output
        String expectedOutput = """
                Rider posting message: New ride available!
                Mediator handling message: New ride available!
                Rider 1 received message: New ride available!
                Rider 2 received message: New ride available!
                Rider 3 received message: New ride available!
                """;

        // Verify output
        assertEquals(expectedOutput, outputStream.toString());
    }
}