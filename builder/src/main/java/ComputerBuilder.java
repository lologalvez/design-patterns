public class ComputerBuilder {

    private MotherBoard motherboard;
    private CPU cpu;
    private RAM ram;
    private GPU gpu;
    private PSU psu;
    private Disk disk;

    public ComputerBuilder withMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public ComputerBuilder withCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder withRAM(RAM ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder withGPU(GPU gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder withPSU(PSU psu) {
        this.psu = psu;
        return this;
    }

    public ComputerBuilder withDisk(Disk disk) {
        this.disk = disk;
        return this;
    }

    public Computer build() {
        return new Computer(motherboard, cpu, ram, gpu, psu, disk);
    }
}
