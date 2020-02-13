import java.util.Objects;

public class Computer {

    private final MotherBoard motherboard;
    private final CPU cpu;
    private final RAM ram;
    private final GPU gpu;
    private final PSU psu;
    private final Disk disk;

    public Computer(MotherBoard motherboard, CPU cpu, RAM ram, GPU gpu, PSU psu, Disk disk) {

        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.psu = psu;
        this.disk = disk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (motherboard != null ? !motherboard.equals(computer.motherboard) : computer.motherboard != null)
            return false;
        if (cpu != null ? !cpu.equals(computer.cpu) : computer.cpu != null) return false;
        if (ram != null ? !ram.equals(computer.ram) : computer.ram != null) return false;
        if (gpu != null ? !gpu.equals(computer.gpu) : computer.gpu != null) return false;
        if (psu != null ? !psu.equals(computer.psu) : computer.psu != null) return false;
        return disk != null ? disk.equals(computer.disk) : computer.disk == null;
    }

    @Override
    public int hashCode() {
        int result = motherboard != null ? motherboard.hashCode() : 0;
        result = 31 * result + (cpu != null ? cpu.hashCode() : 0);
        result = 31 * result + (ram != null ? ram.hashCode() : 0);
        result = 31 * result + (gpu != null ? gpu.hashCode() : 0);
        result = 31 * result + (psu != null ? psu.hashCode() : 0);
        result = 31 * result + (disk != null ? disk.hashCode() : 0);
        return result;
    }
}
