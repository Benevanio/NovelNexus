public class CadastroDeLivro {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "No game No life";
        livro.descricao = "Um livro sobre um jogo";
        livro.isbn = "978-85-66250-46-6";
        livro.categoria = "Aventura";
        livro.editora = "JBC";
        livro.valor = 59.90;
        Autor autor = new Autor();
        autor.nome = "Yuu Kamiya";
        autor.email = "YuuKa@gmail.com";
        autor.cpf = "123.456.789-10";
        livro.autor = autor;
        livro.temAutor();
        livro.aplicardDesconto(0.2);
        livro.mostrarDetalhes();

        Livro Manga = new Livro();
        Manga.nome = "Shoukegeki no soma";
        Manga.descricao = "Shokugeki no Soma conta a história de um garoto chamado Sōma Yukihira, cujo sonho é se tornar um chef em tempo integral no restaurante de seu pai e superar suas habilidades culinárias.";
        Manga.isbn = "978-85-66250-46-6";
        Manga.categoria = "Aventura";
        Manga.editora = "Panini";
        Manga.valor = 23.90;    
        Autor autor2 = new Autor();
        autor2.nome = "Yūto Tsukuda";
        autor2.email = "YuTsu@gmail.com";
        autor2.cpf = "123.456.789-10";
        Manga.autor = autor2;
        Manga.temAutor();
        Manga.aplicardDesconto(0.2);
        Manga.mostrarDetalhes();

    }

}