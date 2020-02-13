public class Disk {
    private String model;
    private String type;
    private int capacity;

    public Disk(String model, String type, int capacity) {
        this.model = model;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Disk disk = (Disk) o;

        if (capacity != disk.capacity) return false;
        if (model != null ? !model.equals(disk.model) : disk.model != null) return false;
        return type != null ? type.equals(disk.type) : disk.type == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + capacity;
        return result;
    }
}
