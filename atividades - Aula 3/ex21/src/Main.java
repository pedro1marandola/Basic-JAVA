
public class Main {
    public static void main(String[] args) {
        Cozinha minhaCozinha = new Cozinha("Italiana", 4, "Branca");

        minhaCozinha.cozinhar(); // Inicia o cozimento
        minhaCozinha.limpar();    // Limpa a cozinha
    }
}