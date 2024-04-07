package Hogwarts;

public class Griffendor extends Hogwarts{
    //Всем Гриффиндорцам присущи благородство, честь и храбрость.
    // умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
    // Гарри Поттер, Гермиона Грейнджер и Рон Уизли
    private int nobility;
    private int honor;
    private int bravery;

    public Griffendor(String name, int powerOfMagic, int transgressOnDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressOnDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {        return nobility;    }
    public void setNobility(int nobility) {        this.nobility = nobility;    }
    public int getHonor() {        return honor;    }
    public void setHonor(int honor) {        this.honor = honor;    }
    public int getBravery() {        return bravery;    }
    public void setBravery(int bravery) {        this.bravery = bravery;    }

    @Override
    protected int sumOfCharakteristik() {
        return nobility+honor+bravery;
    }

    public void compareTo(Griffendor griffendor) {
       compareToStudent(griffendor);
    }

    @Override
    public String toString() {
        return super.toString()+" благородство - %d, честь - %d , храбрость- %d.".formatted(nobility, honor, bravery) ;
    }
}