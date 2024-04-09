import Hogwarts.Griffendor;
import Hogwarts.Kogteran;
import Hogwarts.Puffenduj;
import Hogwarts.Slizerin;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Griffendor harry = generateGriffendor("Гарри Потер");
        Griffendor germiona = generateGriffendor("Гермиона Грейнджер");
        Griffendor ron = generateGriffendor("Рон Уизли");
        Kogteran chzhou = generateKogteran("Чжоу Чанг");
        Kogteran padma = generateKogteran("Падма Патил");
        Kogteran marcus = generateKogteran("Маркус Белби");
        Puffenduj zakharia = generatePuffenduj("Захария Смит");
        Puffenduj sedrik = generatePuffenduj("Седрик Диггори");
        Puffenduj dzhastin = generatePuffenduj("Джастин Финч");
        Slizerin darko = generateSlizerin("Драко Малфой");
        Slizerin graham = generateSlizerin("Грэхэм Монтегю");
        Slizerin gregory = generateSlizerin("Грегори Гойл");
        harry.compareTo(ron);
        harry.print();
        ron.print();
        germiona.compareToHogwarts(graham);
        germiona.print();
        graham.print();
    }

    private static Griffendor generateGriffendor(String name) {
        return new Griffendor(name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static Kogteran generateKogteran(String name) {
        return new Kogteran(name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static Puffenduj generatePuffenduj(String name) {
        return new Puffenduj(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static Slizerin generateSlizerin(String name) {
        return new Slizerin(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }
}