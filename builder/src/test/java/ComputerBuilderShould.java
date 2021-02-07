import components.*;
import computer.Computer;
import computerBuilder.ComputerBuilder;
import org.junit.Assert;
import org.junit.Test;

public class ComputerBuilderShould {

    @Test
    public void build_a_computer_with_all_components() {
        Computer computer = ComputerBuilder.create()
                .withMotherboard(new Motherboard("MSI B450 Mortar Max"))
                .withCPU(new CPU("Ryzen 5 3600", 3.20))
                .withRAM(new RAM("Corsair Vengeance RGB", 8))
                .withPSU(new PSU("NOX VX", 750))
                .withDisk(new Disk("Samsung EVO", "SSD", 500))
                .withGPU(new GPU("XFX RX 590 Fatboy", 8))
                .build();

        Computer expectedComputer = new Computer(
                new Motherboard("MSI B450 Mortar Max"),
                new CPU("Ryzen 5 3600", 3.20),
                new RAM("Corsair Vengeance RGB", 8),
                new PSU("NOX VX", 750),
                new Disk("Samsung EVO", "SSD", 500),
                new GPU("XFX RX 590 Fatboy", 8)
        );

        Assert.assertEquals(expectedComputer, computer);
    }

    @Test
    public void build_a_computer_with_all_required_components() {
        Computer computer = ComputerBuilder.create()
                .withMotherboard(new Motherboard("MSI B450 Mortar Max"))
                .withCPU(new CPU("Ryzen 5 3600", 3.20))
                .withRAM(new RAM("Corsair Vengeance RGB", 8))
                .withPSU(new PSU("NOX VX", 750))
                .withDisk(new Disk("Samsung EVO", "SSD", 500))
                .build();

        Computer expectedComputer = new Computer(
                new Motherboard("MSI B450 Mortar Max"),
                new CPU("Ryzen 5 3600", 3.20),
                new RAM("Corsair Vengeance RGB", 8),
                new PSU("NOX VX", 750),
                new Disk("Samsung EVO", "SSD", 500),
                null
        );

        Assert.assertEquals(expectedComputer, computer);
    }


}
