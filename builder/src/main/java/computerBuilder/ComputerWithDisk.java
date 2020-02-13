package computerBuilder;

import components.GPU;
import computer.Computer;

public interface ComputerWithDisk {
    ComputerWithGPU withGPU(GPU gpu);
    Computer build();
}
