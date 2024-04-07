package Hogwarts;

abstract class Hogwarts {
    private final String name;
    private int powerOfMagic;
    private int transgressOnDistance;

        public Hogwarts(String name, int powerOfMagic, int transgressOnDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressOnDistance = transgressOnDistance;
    }

    public String getName() {
            return name;
        }
    public int getPowerOfMagic() {
            return powerOfMagic;
        }
    public void setPowerOfMagic(int powerOfMagic) {
            this.powerOfMagic = powerOfMagic;
        }
    public int getTransgressOnDistance() {
            return transgressOnDistance;
        }
    public void setTransgressOnDistance(int transgressOnDistance) {
            this.transgressOnDistance = transgressOnDistance;
        }
    private int sumOfBaseCharakteristik() {
            return powerOfMagic + transgressOnDistance;
        }
   protected abstract int sumOfCharakteristik();
        protected void compareToStudent(Hogwarts hogwarts){
            int sumOfCharakteristik1 = this.sumOfCharakteristik();
            int sumOfCharakteristik2 = hogwarts.sumOfCharakteristik();
            if (sumOfCharakteristik1 > sumOfCharakteristik2) {
                System.out.printf("Студент %s лучше студента %s на своем факультете (%d vs %d) %n",this.getName(), (java.lang.Object) hogwarts.getName(), sumOfCharakteristik1, sumOfCharakteristik2 );
            }
            else
            if (sumOfCharakteristik1 < sumOfCharakteristik2) {
                System.out.printf("Студент %s лучше студента %s на своем факультете (%d vs %d) %n",hogwarts.getName(), (java.lang.Object) this.getName(), sumOfCharakteristik1, sumOfCharakteristik2);
            } else {
                System.out.printf("Студенты %s и %s одинаковые на своем факультете (%d vs %d) %n", (java.lang.Object) hogwarts.getName(), this.getName(), sumOfCharakteristik1, sumOfCharakteristik2);
            }
        }
    public void compareToHogwarts(Hogwarts hogwarts) {
        int sumOfCharakteristik1 = this.sumOfBaseCharakteristik();
        int sumOfCharakteristik2 = hogwarts.sumOfBaseCharakteristik();
        if (sumOfCharakteristik1 > sumOfCharakteristik2) {
            System.out.printf(
                    "Студент %s лучше студента %s в Хогвардсе  (%d vs %d), %n",
                   this.getName(),
                   hogwarts.getName(),
                   sumOfCharakteristik1,
                   sumOfCharakteristik2
            );
        }
        else
        if (sumOfCharakteristik1 < sumOfCharakteristik2) {
            System.out.printf(
                    "Студент %s лучше студента %s в Хогвардсе (%d vs %d), %n",
                    hogwarts.getName(),
                    this.getName(),
                    sumOfCharakteristik2,
                    sumOfCharakteristik1
            );
        } else {
            System.out.printf(
                    "Студенты %s и %s одинаковые в Хогвардсе (%d vs %d), %n %n",
                    hogwarts.getName(),
                    this.getName(),
                    sumOfCharakteristik1,
                    sumOfCharakteristik2
            );
        }
}

    @Override
    public String toString() {
        return "%s, %n Общие: сила магии - %d, дальность трансгрессии - %d;%n Силы факультета: ".formatted(name, powerOfMagic, transgressOnDistance) ;
    }
    public void print(){
        System.out.println(this);
    }
}
