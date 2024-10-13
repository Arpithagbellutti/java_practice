package practice_e;

public class enum_prctice {
    public static void main(String[] args) {
        System.out.println(BookingStatus.Confirm.getStatusID());
        System.out.println(Day.Tuesday);
        System.out.println(Day.Tuesday.getDayId());

    }
}
enum BookingStatus{
    Held(0),Confirm(1),PendingConfirm(2),Failed(3);

    int statusID;

    BookingStatus(int statusID){
        this.statusID = statusID;
    }
    int getStatusID(){
        return statusID;
    }
}
enum Day{
    Monday(1),Tuesday(2),Wednesday(3),Thursday(4),Friday(5),Saturday(6),Sunday(0);

    int dayId;
    Day(int dayId){
        this.dayId = dayId;
    }
    int getDayId(){
        return dayId;
    }
}
