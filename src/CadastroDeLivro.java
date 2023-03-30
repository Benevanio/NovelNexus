public class CadastroDeLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setNome("No game No life");
        livro.setDescricao = "Um livro sobre um jogo";
        livro.setIsbn("978-85-66250-46-6");
        livro.setCategoria("Aventura");
        livro.setEditora("JBC");
        livro.setValor(59.90);
        Autor autor = new Autor();
        autor.setNome("Yuu Kamiya");
        autor.setEmail("YuuKa@gmail.com");
        autor.setCpf("123.456.789-10");
        livro.autor = autor;
        livro.temAutor();       
        livro.mostrarDetalhes();

        Livro Manga = new Livro();
        Manga.setNome("Shoukegeki no soma");
        Manga.setDescricao("Shokugeki no Soma conta a história de um garoto chamado Sōma Yukihira, cujo sonho é se tornar um chef em tempo integral no restaurante de seu pai e superar suas habilidades culinárias.");
        Manga.setIsbn("978-85-66250-46-6");
        Manga.setCategoria("Aventura");
        Manga.setEditora("Panini");
        Manga.setValor(23.90);    
        Autor autor2 = new Autor();
        autor2.nome = "Yūto Tsukuda";
        autor2.email = "YuTsu@gmail.com";
        autor2.cpf = "123.456.789-10";
        Manga.autor = autor2;
        Manga.temAutor();
        Manga.mostrarDetalhes();
    }

}