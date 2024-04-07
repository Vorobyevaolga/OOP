package Hogwarts;

public class Slizerin extends Hogwarts {
    //Драко Малфой, Грэхэм Монтегю, Грегори Гойл
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;


    public Slizerin(String name, int powerOfMagic, int transgressOnDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgressOnDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    protected int sumOfCharakteristik() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compareTo(Slizerin slizerin) {
        compareToStudent(slizerin);
    }
    @Override
    public String toString() {
        return super.toString()+
                "амбициозность - %d, решительность - %d , жажда власти - %d,хитрость - %d, находчивость - %d."
                        .formatted(ambition, determination, lustForPower,cunning, resourcefulness);
    }
}
