public enum PlaneType {
    BOEING747(524, 187000),
    AIRBUSA320(170, 83000),
    DOUGLASDC3(28, 11430);

    private final int capacity;
    private final int totalWeightKG;

    PlaneType(int capacity, int totalWeightKG) {
        this.capacity = capacity;
        this.totalWeightKG = totalWeightKG;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeightKG() {
        return this.totalWeightKG;
    }
}


