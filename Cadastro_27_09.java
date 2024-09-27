public class Cadastro_27_09 {
    // Atributo do cadastro
    int idade;
    String nome;
    String sobrenone;
    String genero;
    String cor;

    public static void main(String[] args) {
        //criei o novo objeto eu como o molde de cadastro, poderia ser criado varios com o mesmo molde
        Cadastro_27_09 eu = new Cadastro_27_09();
        
        //adicionei valores ao objeo
        eu.idade = 30;
        eu.genero = "masculino";
        eu.nome = "Gabriel";
        eu.sobrenone = "kraus";
        eu.cor = "branca";
        //imprimir tudo
        System.out.println("Cadastro pessoa fisica");
        System.out.println("Nome: " + eu.nome + " " + eu.sobrenone);
        System.out.println("Idade: " +eu.idade);
        System.out.println("Genero: "+ eu.genero);
        System.out.println("Cor da pele: "+ eu.cor);
    }
}
