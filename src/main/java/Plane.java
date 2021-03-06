public class Plane {
    private PlaneType plane;

    public Plane(PlaneType plane){
        this.plane = plane;
    }

    public PlaneType getPlaneType() {
        return plane;
    }

    public int getCapacityFromEnum(){
        return this.plane.getCapacity();
    }

    public int getTotalWeightFromEnum(){
        return this.plane.getTotalWeight();
    }
}

