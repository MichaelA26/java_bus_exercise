import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Skinflats", 10);
        busStop = new BusStop("Rocketrocket");
        busStop.addPerson(person);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger();
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger();
        bus.addPassenger();
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canPickupPassengerFromBusStop(){
        bus.pickup(busStop);
        assertEquals(0, busStop.busStopCount());
        assertEquals(1, bus.passengerCount());
    }

}
