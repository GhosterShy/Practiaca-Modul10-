import java.util.Date;

class  RoomBookingRoom
{
    public int BookRoom(Date startdate,Date endDate,int quest) {
        return 203;
    }


    public  boolean Payment(int RoomNumber)
    {
        return  true;
    }
}


class  CleaningService
{
    public  void  NotifyCleaning(Date startdate,Date endDate,int quest) {}

    public  void CheckOut(Date endDate,int quest) {}

}

class  RestaurantSystem
{
    public void  NotifyRestaurant(Date startdate,Date endDate,int quest ){}
}



class  HotelFacade
{
    public  void  ReserveRoom(Date startdate,Date endDate,int quest){
        RoomBookingRoom  roomBookingRoom = new RoomBookingRoom();
        int roomId = roomBookingRoom.BookRoom(startdate,endDate,quest);
        if(roomBookingRoom.Payment(roomId) == true)
        {
            CleaningService cleaningService = new CleaningService();
            cleaningService.NotifyCleaning(startdate,endDate,quest);
            cleaningService.CheckOut(endDate,quest);
            RestaurantSystem restaurantSystem = new RestaurantSystem();
            restaurantSystem.NotifyRestaurant(startdate,endDate,roomId);
        }
    }





}




public class Main {
    public static void main(String[] args) {
        HotelFacade hotelFacade = new HotelFacade();

    }
}


