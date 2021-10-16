package Q_04;

public class objpost {
    public static void main(String[] args) {
        Post post = new Post("Estou cansado de ver terraplanistas nessa rede social, vão procurar o que fazre.", "https://www.youtube.com/watch?v=Mum0CdgHuYg");

        post.curtir();
        post.curtir();
        post.curtir();
        System.out.println("O número de curtidas é: " + post.getNumeroCurtidas());
        System.out.println("");
        post.compartilhar();
        post.compartilhar();
        System.out.println("O número de compartilhamentos é: " + post.getNumeroCompa());
    }
}
