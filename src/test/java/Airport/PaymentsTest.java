package Airport;

import org.junit.Before;

import ru.Faimoons.Model.Airport;
import ru.Faimoons.Model.Payments;
import ru.Faimoons.Transport.AirPlane.AirCarry456;
import ru.Faimoons.Transport.AirPlane.Airbus381;

import java.util.ArrayList;


public class PaymentsTest {
    static Payments test;
    static ArrayList<Airport> g;
    int a;

    public int getA() {
        return a;
    }

    @Before
    public void dghdg() {
        Airport airBus381 = new Airbus381(1, 20000, 30, "While", 310, true, false);
        Airport airCarry456 = new AirCarry456(1, 3000, 60, "While", 6, false, true);
        test = new Payments();
        g = new ArrayList<>();
        g.add(airBus381);
        g.add(airCarry456);
    }

//    @Test
//    public void totalCarryingCapacityCalculation() {
//        Assert.assertEquals(90,80+10);
//    }

//    @Test
//    void totalNumberOfPassengersAndPeosonal() {
//    }
}