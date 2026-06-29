class ParkingSpot{
    //is free or not
    //specific number
    //type of vechicle it can store or not

    private boolean isOccupied;
    private String spotId;
    private int floorNumber;
    private VehicleType supportedVehicleType;;

    public ParkingSpot(String spotId, int floorNumber, VehicleType supportedVehicleType;){
        this.spotId = spotId;
        this.supportedVehicleType = supportedVehicleType;
        this.floorNumber = floorNumber;
        isOccupied = false;
    }
    public int getId(){
        return spotId;
    }
    public boolean getOccupied(){
        return isOccupied;
    }
    public VehicleType getVechicle(){
        return vechicle;
    }
    public int getFloorNumber() { return floorNumber; }
    public void occupySpot(){
        if (isOccupied) {
            throw new IllegalStateException("Spot is already occupied!");
        }
        this.isOccupied = true;
    }
    public void freeSpot(){
        if (!isOccupied) {
            throw new IllegalStateException("Spot is already free!");
        }
        isOccupied = false;
    }

}