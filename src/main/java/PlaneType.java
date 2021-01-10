public enum PlaneType {
    BOEING747(10, 150),
    AIRBUSA380(20, 250),
    DOUGLASDC3(30, 350),
    BOEING737(40, 450);

    private final int capacity;
    private int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
