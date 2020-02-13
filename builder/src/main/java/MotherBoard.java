public class MotherBoard {
    private String model;

    public MotherBoard(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MotherBoard that = (MotherBoard) o;

        return model != null ? model.equals(that.model) : that.model == null;
    }

    @Override
    public int hashCode() {
        return model != null ? model.hashCode() : 0;
    }
}
