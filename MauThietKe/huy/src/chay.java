public class chay {
    
    public static void main(String[] args) throws Exception {

            Customer mike = new Customer("Thg Ngu");

            Room one_bedroom1 = new Room(001, 100.00, Room.roomType.ONE_BED);
            Room two_bedroom1 = new Room(002, 200.00, Room.roomType.TWO_BED);

            one_bedroom1.setAvailable(true);
            two_bedroom1.setAvailable(true);

            System.out.println(one_bedroom1.isAvailable());

            mike.checkIn(one_bedroom1);
            one_bedroom1.setCustomer(mike);
            mike.getRoomInfo(one_bedroom1);

        }
}