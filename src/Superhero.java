public class Superhero {
    private String Name;
    private String realName;
    private String superPower;
    private int yearCreated;
    private boolean isHuman;
    private String strength;

    // Konstruktør metode
    public Superhero(String Name, String realName, String superPower, int yearCreated,
                     boolean isHuman, String strength) {
        this.Name = Name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    // setIsHuman metode
    public void setIsHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }

    // get metoder
    public String getName() {
        return Name;
    }

    public String getRealName() {
        return realName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public String getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "Name='" + Name + '\'' +
                ", realName='" + realName + '\'' +
                ", superPower='" + superPower + '\'' +
                ", yearCreated=" + yearCreated +
                ", isHuman=" + isHuman +
                ", strength='" + strength + '\'' +
                '}';
    }
}