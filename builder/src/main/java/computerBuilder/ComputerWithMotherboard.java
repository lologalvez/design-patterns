package computerBuilder;

import components.CPU;

public interface ComputerWithMotherboard {
    ComputerWithCPU withCPU(CPU cpu);
}
