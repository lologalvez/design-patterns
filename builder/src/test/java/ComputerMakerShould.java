import org.junit.Assert;
import org.junit.Test;

public class ComputerMakerShould {

    @Test
    public void have_a_way_to_add_a_cpu() {
        ComputerMaker computerMaker = new ComputerMaker();
        ComputerMaker expectedComputerMaker = new ComputerMaker("Ryzen 5 3600");

        computerMaker.addCPU("Ryzen 5 3600");

        Assert.assertEquals(expectedComputerMaker, computerMaker);

    }
}
