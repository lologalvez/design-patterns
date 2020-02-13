public class ComputerMaker {

    private String cpu;

    public ComputerMaker() { }

    public ComputerMaker(String cpu) {
        this.cpu = cpu;
    }

    public void addCPU(String cpuModel) {
        this.cpu = cpuModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComputerMaker computerMaker = (ComputerMaker) o;

        return cpu != null ? cpu.equals(computerMaker.cpu) : computerMaker.cpu == null;
    }

    @Override
    public int hashCode() {
        return cpu != null ? cpu.hashCode() : 0;
    }
}
