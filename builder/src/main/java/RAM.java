public class RAM {

    private final String model;
    private final int capacity;

    public RAM(String model, int gigabytes) {
        this.model = model;
        this.capacity = gigabytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RAM ram = (RAM) o;

        if (capacity != ram.capacity) return false;
        return model != null ? model.equals(ram.model) : ram.model == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + capacity;
        return result;
    }
}
