import middleEarthling.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FellowshipOfTheRingShould {

    @Test
    public void be_able_to_add_new_fellows() {
        FellowshipOfTheRing fellowShip = new FellowshipOfTheRing();
        MiddleEarthling frodo = new Hobbit("Frodo");

        // Expected
        List<Fellow> fellowList = new ArrayList<Fellow>();
        fellowList.add(FellowFactory.register(frodo));
        FellowshipOfTheRing expectedFellowship = new FellowshipOfTheRing(fellowList);

        fellowShip.addFellow(frodo);

        Assert.assertEquals(expectedFellowship, fellowShip);
    }

    @Test
    public void be_able_to_remove_fellows() {
        FellowshipOfTheRing fellowShip = new FellowshipOfTheRing();
        MiddleEarthling frodo = new Hobbit("Frodo");
        FellowshipOfTheRing expectedFellowship = new FellowshipOfTheRing();

        fellowShip.addFellow(frodo);
        fellowShip.expelFellow(frodo);

        Assert.assertEquals(expectedFellowship, fellowShip);
    }

    @Test
    public void pay_to_any_elf_100_percent_of_baseSalary() {
        FellowshipOfTheRing fellowShip = new FellowshipOfTheRing();
        MiddleEarthling legolas = new Elf("Legolas");
        fellowShip.addFellow(legolas);
        Fellow fellowLegolas = fellowShip.find(legolas);

        fellowShip.payFellows();

        Assert.assertEquals(1000, fellowLegolas.getBalance());
    }

    @Test
    public void pay_to_any_man_90_percent_of_baseSalary() {
        FellowshipOfTheRing fellowShip = new FellowshipOfTheRing();
        MiddleEarthling aragorn = new Man("Aragorn");
        fellowShip.addFellow(aragorn);
        Fellow fellowAragorn = fellowShip.find(aragorn);

        fellowShip.payFellows();

        Assert.assertEquals(900, fellowAragorn.getBalance());
    }

    @Test
    public void pay_to_any_dwarf_70_percent_of_baseSalary() {
        FellowshipOfTheRing fellowShip = new FellowshipOfTheRing();
        MiddleEarthling gimli = new Dwarf("Gimli");
        fellowShip.addFellow(gimli);
        Fellow fellowGimli = fellowShip.find(gimli);

        fellowShip.payFellows();

        Assert.assertEquals(700, fellowGimli.getBalance());
    }

    @Test
    public void pay_to_any_dwarf_50_percent_of_baseSalary() {
        FellowshipOfTheRing fellowShip = new FellowshipOfTheRing();
        MiddleEarthling frodo = new Hobbit("Frodo");
        fellowShip.addFellow(frodo);
        Fellow fellowFrodo = fellowShip.find(frodo);

        fellowShip.payFellows();

        Assert.assertEquals(500, fellowFrodo.getBalance());
    }



}
