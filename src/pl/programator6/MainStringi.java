package pl.programator6;

public class MainStringi {
    public static void main(String[] args) {
        String slowo = "ABCDEABC";

        System.out.println(slowo.toLowerCase().replace("ab",""));
        System.out.println(slowo);

        String napis = "asdf" + "asdf" + "asdf" + "Asdf";

        StringBuilder sb = new StringBuilder();

        sb.append("asdf").append("asdf")
                .append("asdf").append("Asdf");

        String wynik = sb.toString();
        System.out.println(wynik);
    }
}
