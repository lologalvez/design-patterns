package computerBuilder;

import components.*;
import computer.Computer;

public class ComputerBuilder implements EmptyComputer, ComputerWithMotherboard, ComputerWithCPU, ComputerWithRAM, ComputerWithGPU, ComputerWithPSU, ComputerWithDisk {

    private Motherboard motherboard;
    private CPU cpu;
    private RAM ram;
    private PSU psu;
    private Disk disk;
    private GPU gpu;

    public static EmptyComputer create() {
        return new ComputerBuilder();
    }

    public ComputerWithMotherboard withMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public ComputerWithCPU withCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerWithRAM withRAM(RAM ram) {
        this.ram = ram;
        return this;
    }

    public ComputerWithGPU withGPU(GPU gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerWithPSU withPSU(PSU psu) {
        this.psu = psu;
        return this;
    }

    public ComputerWithDisk withDisk(Disk disk) {
        this.disk = disk;
        return this;
    }

    public Computer build() {
        return new Computer(motherboard, cpu, ram, psu, disk, gpu);
    }
}
