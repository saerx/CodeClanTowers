import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int cowpacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int cowpacity) {
        this.name = name;
        this.cowpacity = cowpacity;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCowpacity() {
        return cowpacity;
    }

    public void setCowpacity(int cowpacity) {
        this.cowpacity = cowpacity;
    }

    public int getGuests() {
        return guests.size();
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void addGuest(Guest cow) {
        this.guests.add(cow);
    }
}
