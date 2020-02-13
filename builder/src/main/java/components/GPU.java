package components;

public class GPU {
    private final String model;
    private final int capacity;

    public GPU(String model, int gigabytes) {
        this.model = model;
        this.capacity = gigabytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GPU gpu = (GPU) o;

        if (capacity != gpu.capacity) return false;
        return model != null ? model.equals(gpu.model) : gpu.model == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + capacity;
        return result;
    }
}
