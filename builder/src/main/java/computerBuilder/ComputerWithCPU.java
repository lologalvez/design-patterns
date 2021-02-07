package computerBuilder;

import components.RAM;

public interface ComputerWithCPU {
    ComputerWithRAM withRAM(RAM ram);
}
