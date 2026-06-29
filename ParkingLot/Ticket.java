import java.time.LocalDateTime;

enum VehicleType{
    TWO_WHEELER;
    THREE_WHEELER;
    FOUR_WHEELER;
}
 
enum TicketStatus {
    ACTIVE,
    COMPLETED
}
class Ticket{
    //private bcoz of Encapsulation
    private String id;
    private LocalTime entryTime;
    private VehicleType vechicle;
    private TicketStatus status;
    private LocalTime endTime;

    public Ticket(int id, LocalTime entryTime, VehicleType vechicle){
        this.id = id;
        this.entryTime = entryTime;
        this.vechicle = vechicle;
        this.status = TicketStatus.ACTIVE;
        this.exitTime = null; 
    }

    public string getId(){ return id };
    public LocalTime getentryTime(){ return entryTime};
    public VehicleType getvehicleType(){ return vechicle};
    public TicketStatus getstatus(){ return status};
    public LocalTime getentryTime(){ return exitTime};

    public void setExitTime(LocalTime exitTime){
        this.exitTime =  exitTime;
        this.status = status;
    }

}