public class CadastroDeLivro {
    public static void main(String[] args) {
    
        Autor autor2 = new Autor();
        autor2.setNome("Yūto Tsukuda");
        autor2.setEmail("YuTsu@gmail.com");
        autor2.setCpf("123.456.789-10");   

        Livro Manga = new Livro(autor2);
        Manga.setNome("Shoukegeki no soma");
        Manga.setDescricao("Shokugeki no Soma conta a história de um garoto chamado Sōma Yukihira, cujo sonho é se tornar um chef em tempo integral no restaurante de seu pai e superar suas habilidades culinárias.");
        Manga.setIsbn("978-85-66250-46-6");
        Manga.setCategoria("Aventura");
        Manga.setEditora("Panini");
        Manga.setValor(23.90);    
        Manga.temAutor();
        Manga.mostrarDetalhes();

        Autor autor3 = new Autor();
        autor3.setNome("Yuu Kamiya");
        autor3.setEmail("YuuKa@gmail.com");
        autor3.setCpf("123.456.789-10");


        Livro Anime = new Livro(autor3);
        Anime.setNome("No game No life");
        Anime.setDescricao("No game no life é uma série de light novels japonesa escrita por Yuu Kamiya e ilustrada por Mashiro Hiiragi. A série é publicada pela Media Factory desde 30 de janeiro de 2012, com 12 volumes compilados até o momento.");
        Anime.setIsbn("978-85-66250-46-6");
        Anime.setCategoria("Aventura");
        Anime.setEditora("JBC");
        Anime.setValor(59.90);
        Anime.temAutor();
        Anime.mostrarDetalhes();
        
    }

}