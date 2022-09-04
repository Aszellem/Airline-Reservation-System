import java.util.Random;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    // String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * Function name: applyPassport
     * 
     * @return (boolean)
     *
     *         Inside the function:
     *         1. Returns a random boolean of true or false.
     */

    public boolean applyPassport() {
        Random random = new Random();
        return random.nextBoolean();
    }

    /**
     * Function name: chooseSeat
     *
     * Inside the function:
     * 1. Sets this.seat to a random number between 1 -- 11.
     */

    public void chooseSeat() {
        this.seatNumber = (int) Math.random() * 11 + 1;
    }

}
