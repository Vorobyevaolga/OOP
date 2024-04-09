package Hogwarts;

public class Puffenduj extends Hogwarts {
    //Захария Смит, Седрик Диггори, Джастин Финч
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Puffenduj(String name, int powerOfMagic, int transgressOnDistance, int hardWork, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressOnDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    protected int sumOfCharakteristik() {
        return hardWork + honesty + loyalty;
    }

    public void compareTo(Puffenduj puffenduj) {
        compareToStudent(puffenduj);
    }

    @Override
    public String toString() {
        return super.toString() + " честность - %d, трудолюбие - %d , верность - %d.".formatted(honesty, hardWork, loyalty);
    }
}
