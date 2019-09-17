package pl.programator;

public class Kalkulator implements IKalkulator {
    @Override
    public void mojaMetoda() {
        System.out.println("Moja metoda !!");
    }

    @Override
    public int dodaj(int a, int b) {
        return a + b;
    }

    @Override
    public int odejmij(int a, int b) {
        return a - b;
    }
}
