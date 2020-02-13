public class PSU {
    private final String model;
    private final int power;

    public PSU(String model, int power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PSU psu = (PSU) o;

        if (power != psu.power) return false;
        return model != null ? model.equals(psu.model) : psu.model == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + power;
        return result;
    }
}
