public class ElfSquadronFactory extends SquadronFactory {
    public Mage createMage() {
        return new ElfMage();
    }

    public Archer createArcher() {
        return new ElfArcher();
    }

    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}

class ElfMage implements Mage {
    public void cast() {
        // использовать магию эльфов
        System.out.println("Magic is used");
    }
}

class ElfArcher implements Archer {
    public void shoot() {
        // использовать лук эльфов
        System.out.println("Archer is shooting");
    }
}

class ElfWarrior implements Warrior {
    public void attack() {
        // использовать меч эльфов
        System.out.println("Warrior attack !");
    }
}

