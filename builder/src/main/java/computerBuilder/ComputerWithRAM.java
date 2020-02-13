package computerBuilder;

import components.PSU;

public interface ComputerWithRAM {
    ComputerWithPSU withPSU(PSU psu);
}
