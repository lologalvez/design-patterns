package components;

public class Motherboard {
    private String model;

    public Motherboard(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Motherboard that = (Motherboard) o;

        return model != null ? model.equals(that.model) : that.model == null;
    }

    @Override
    public int hashCode() {
        return model != null ? model.hashCode() : 0;
    }
}
