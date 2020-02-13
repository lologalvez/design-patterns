import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class FellowshipOfTheRingShould {

    @Test
    public void be_able_to_add_new_fellows() {
        FellowShipOfTheRing fellowShip = new FellowShipOfTheRing();
        MiddleEarthling frodo = new Hobbit("Frodo");
        List<MiddleEarthling> fellowList = new ArrayList<MiddleEarthling>();
        fellowList.add(frodo);
        FellowShipOfTheRing expectedFellowship = new FellowShipOfTheRing(fellowList);

        fellowShip.addFellow(frodo);

        Assert.assertEquals(expectedFellowship, fellowShip);
    }

}
