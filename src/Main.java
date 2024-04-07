import Hogwarts.Griffendor;
import Hogwarts.Kogteran;
import Hogwarts.Puffenduj;
import Hogwarts.Slizerin;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Griffendor harry = generatGriffendor("Гарри Потер");
        Griffendor germiona = generatGriffendor("Гермиона Грейнджер");
        Griffendor ron = generatGriffendor("Рон Уизли");
        Kogteran chzhou = generatKogteran("Чжоу Чанг");
        Kogteran padma = generatKogteran("Падма Патил");
        Kogteran marcus = generatKogteran("Маркус Белби");
        Puffenduj zakharia = generatPuffenduj("Захария Смит");
        Puffenduj sedrik = generatPuffenduj("Седрик Диггори");
        Puffenduj dzhastin = generatPuffenduj("Джастин Финч");
        Slizerin darko = generatSlizerin("Драко Малфой");
        Slizerin graham = generatSlizerin("Грэхэм Монтегю");
        Slizerin gregory = generatSlizerin("Грегори Гойл");
        harry.compareTo(ron);
        harry.print();
        ron.print();
        germiona.compareToHogwarts(graham);
        germiona.print();
        graham.print();
        }

    private static Griffendor generatGriffendor(String name) {
        return new Griffendor(name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

        private static Kogteran generatKogteran (String name){
            return new Kogteran(name,
                    ThreadLocalRandom.current().nextInt(0, 100),
                    ThreadLocalRandom.current().nextInt(0, 100),
                    ThreadLocalRandom.current().nextInt(0, 100),
                    ThreadLocalRandom.current().nextInt(0, 100),
                    ThreadLocalRandom.current().nextInt(0, 100),
                    ThreadLocalRandom.current().nextInt(0, 100)
            );
        }

        private static Puffenduj generatPuffenduj (String name){
                return new Puffenduj(
                        name,
                        ThreadLocalRandom.current().nextInt(0, 100),
                        ThreadLocalRandom.current().nextInt(0, 100),
                        ThreadLocalRandom.current().nextInt(0, 100),
                        ThreadLocalRandom.current().nextInt(0, 100),
                        ThreadLocalRandom.current().nextInt(0, 100)
                );
            }
            private static Slizerin generatSlizerin (String name){
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