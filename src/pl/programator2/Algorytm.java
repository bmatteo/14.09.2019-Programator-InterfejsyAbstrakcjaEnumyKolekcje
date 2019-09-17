package pl.programator2;

public abstract class Algorytm {

    public void wykonajAlgorytm() {
        wczytajDane();
        pierwszyEtapLiczenia();
        drugiEtapLiczenia();
        trzeciEtapLiczenia();
        zapiszWyniki();
    }

    public abstract void wczytajDane();

    private void pierwszyEtapLiczenia() {
        System.out.println("Wykonuję pierwszy etap liczenia !!");
    }

    private void drugiEtapLiczenia() {
        System.out.println("Wykonuję drugi etap liczenia !!");
    }

    private void trzeciEtapLiczenia() {
        System.out.println("Wykonuję trzeci etap liczenia !!");
    }

    public abstract void zapiszWyniki();

}
