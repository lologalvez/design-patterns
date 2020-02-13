package computerBuilder;

import components.Motherboard;

public interface EmptyComputer {
    ComputerWithMotherboard withMotherboard(Motherboard motherboard);
}
