import java.util.ArrayList;
import java.util.List;

public class FellowShipOfTheRing {

    List<MiddleEarthling> fellowList;

    public FellowShipOfTheRing() {
        fellowList = new ArrayList<MiddleEarthling>();
    }

    public FellowShipOfTheRing(List<MiddleEarthling> fellowList) {
        this.fellowList = fellowList;
    }

    public void addFellow(MiddleEarthling fellow) {
        this.fellowList.add(fellow);
    }

    public void expelFellow(MiddleEarthling fellow) {
        this.fellowList.remove(fellow);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FellowShipOfTheRing that = (FellowShipOfTheRing) o;

        return fellowList != null ? fellowList.equals(that.fellowList) : that.fellowList == null;
    }

    @Override
    public int hashCode() {
        return fellowList != null ? fellowList.hashCode() : 0;
    }

}
