package computerBuilder;

import components.Disk;

public interface ComputerWithPSU {
    ComputerWithDisk withDisk(Disk disk);
}
