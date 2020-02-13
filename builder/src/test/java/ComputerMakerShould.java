import org.junit.Assert;
import org.junit.Test;

public class ComputerMakerShould {

    @Test
    public void have_a_way_to_add_a_cpu() {
        ComputerMaker computerMaker = new ComputerMaker("Ryzen 5 3600", 8);
        ComputerMaker expectedComputerMaker = new ComputerMaker("Ryzen 5 3600");

        computerMaker.addCPU("Ryzen 5 3600");

        Assert.assertEquals(expectedComputerMaker, computerMaker);

    }

    @Test
    public void have_a_way_to_add_ram_modules() {
        ComputerMaker computerMaker = new ComputerMaker("Ryzen 5 3600", 8);
        ComputerMaker expectedComputerMaker = new ComputerMaker("Ryzen 5 3600", 8);

        computerMaker.addRAM(8);

        Assert.assertEquals(expectedComputerMaker, computerMaker);
    }
}
