import middleEarthling.*;
import salary.DwarfSalaryStrategy;
import salary.ElfSalaryStrategy;
import salary.HobbitSalaryStrategy;
import salary.ManSalaryStrategy;

public class FellowFactory {
    public static Fellow register(MiddleEarthling middleEarthling) {
        if (middleEarthling instanceof Elf)
            return new Fellow(middleEarthling, new ElfSalaryStrategy());
        if (middleEarthling instanceof Man)
            return new Fellow(middleEarthling, new ManSalaryStrategy());
        if (middleEarthling instanceof Dwarf)
            return new Fellow(middleEarthling, new DwarfSalaryStrategy());
        if (middleEarthling instanceof Hobbit)
            return new Fellow(middleEarthling, new HobbitSalaryStrategy());
        return null;
    }
}
