public class Customer {

  private String name;
  private boolean checkedIn;
  private Room room;

  public Customer(String name) {
    this.name = name;
  }

  public void checkIn(Room room) {
    if (this.getStatus() == false) {
      this.setCheckedIn(true);
      this.setRoom(room);
    }
  }

  public void checkOut() {
    if (this.getStatus() == true) {
      this.setCheckedIn(false);
      this.setRoom(null);
    }
  }

  public boolean getStatus() {
    return checkedIn;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Room getRoom() {
    return room;
  }

  public void setRoom(Room room) {
    this.room = room;
  }

  public void setCheckedIn(boolean checkedIn) {
    this.checkedIn = checkedIn;
  }

  public void getRoomInfo(Room room) {
    System.out.println("Room # : " + room.getRoomNumber());
    System.out.println("Room price : " + room.getPrice());
    System.out.println("Room type : " + room.getRoomType());
    System.out.println("Room occupant : " + room.getCustomer().getName());
  }
}