public class CPU {
    private final String model;
    private final double clock;

    public CPU(String model, double clock) {
        this.model = model;
        this.clock = clock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CPU cpu = (CPU) o;

        if (Double.compare(cpu.clock, clock) != 0) return false;
        return model != null ? model.equals(cpu.model) : cpu.model == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model != null ? model.hashCode() : 0;
        temp = Double.doubleToLongBits(clock);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
