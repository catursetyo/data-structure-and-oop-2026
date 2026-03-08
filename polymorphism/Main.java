package polymorphism;

public class Main {
    public static void main(String[] args) throws Exception {
        // parent class declared as data type, but child class declared as object
        Noodle jaki = new Gacoan();
        Noodle dzili = new Indomie();

        jaki.cook();
        dzili.cook();
    }
}