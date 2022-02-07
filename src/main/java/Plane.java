public class Plane {
   private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public int getCapacity() {
        return this.planeType.getCapacity();
    }

    public int getTotalWeightKG() {
        return this.planeType.getTotalWeightKG();
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }
}
