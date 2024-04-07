package Hogwarts;

public class Kogteran extends Hogwarts {

    //Чжоу Чанг, Падма Патил и Маркус Белби
    private int smart;
    private int wisdom;
    private int wit;
    private int creation;

    public Kogteran(String name, int powerOfMagic, int transgressOnDistance, int smart, int wisdom, int wit, int creation) {
        super(name, powerOfMagic, transgressOnDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    protected int sumOfCharakteristik() {
        return wit + creation + smart + wisdom;
    }

    public void compareTo(Kogteran kogteran) {
        compareToStudent(kogteran);
    }

    @Override
    public String toString() {
        return super.toString()+"ум - %d, мудрость - %d , остроумие - %d, творчество- %d.".formatted(smart, wisdom, wit, creation) ;
    }
}
