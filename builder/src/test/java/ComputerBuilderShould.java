import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ComputerBuilderShould {

    private static Stream<Arguments> testForBuildingAPC() {
        return Stream.of(
                Arguments.of(new ComputerBuilder().withCPU(new CPU("Ryzen 5 3600", 3.20)).build(),
                        new Computer(null, new CPU("Ryzen 5 3600", 3.20), null, null, null, null))
                        new Computer(null, new CPU("Ryzen 5 3600", 3.20), null, null, null, null))
        );
    }

    @ParameterizedTest(name = "{index} => Computer={0}, Computer={1}")
    @MethodSource("testForBuildingAPC")
    public void be_able_to_set_a_cpu(Computer computer, Computer expectedComputer) {
        Assertions.assertEquals(expectedComputer, computer);
    }
}
