package middleEarthling;

import java.util.Objects;

public abstract class MiddleEarthling {

    private String name;

    public MiddleEarthling(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MiddleEarthling that = (MiddleEarthling) o;

        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
