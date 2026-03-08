package polymorphism;

class Noodle {
    public void cook() {
        System.out.println("Cooking noodle...");
    }
}

class Gacoan extends Noodle {
    @Override
    public void cook() {
        System.out.println("Cooking Gacoan...");
    }
}

class Indomie extends Noodle {
    @Override
    public void cook() {
        System.out.println("Cooking Indomie...");
    }
}