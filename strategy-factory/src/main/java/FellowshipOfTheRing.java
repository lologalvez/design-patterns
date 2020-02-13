import middleEarthling.MiddleEarthling;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FellowshipOfTheRing {

    List<Fellow> fellowList;
    int baseSalary;

    public FellowshipOfTheRing() {
        fellowList = new ArrayList<Fellow>();
        this.baseSalary = 1000;
    }

    public FellowshipOfTheRing(List<Fellow> fellowList) {
        this.fellowList = fellowList;
        this.baseSalary = 1000;
    }

    public void addFellow(MiddleEarthling middleEarthling) {
        Fellow fellow = FellowFactory.register(middleEarthling);
        this.fellowList.add(fellow);
    }

    public void expelFellow(MiddleEarthling middleEarthling) {
        Fellow fellow = FellowFactory.register(middleEarthling);
        this.fellowList.remove(fellow);
    }

    public void payFellows() {
        for(Fellow fellow : fellowList) {
            fellow.paySalary(baseSalary);
        }
    }

    public Fellow find(MiddleEarthling middleEarthling) {
        Fellow fellow = FellowFactory.register(middleEarthling);
        return fellowList.get(fellowList.indexOf(fellow));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FellowshipOfTheRing that = (FellowshipOfTheRing) o;

        return Objects.equals(fellowList, that.fellowList);
    }

    @Override
    public int hashCode() {
        return fellowList != null ? fellowList.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "FellowshipOfTheRing{" +
                "fellowList=" + fellowList +
                ", baseSalary=" + baseSalary +
                '}';
    }

}
