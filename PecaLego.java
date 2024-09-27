public class PecaLego {
    // Atributo (característica da peça)
    int numeroDePinos;

    public static void main(String[] args) {
        // Criando um objeto (uma peça Lego real)
        PecaLego minhaPeca = new PecaLego();
        
        // Definindo o atributo (característica da peça)
        minhaPeca.numeroDePinos = 4;
        
        // Mostrando a característica da peça
        System.out.println("Minha peça Lego tem " + minhaPeca.numeroDePinos + " pinos");
    }
}
