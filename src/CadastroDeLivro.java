import autor.Autor;
import produtos.Ebook;
import produtos.Livro;

public class CadastroDeLivro {
    public static void main(String[] args) {
    
        Autor autor2 = new Autor();
        autor2.setNome("Yūto Tsukuda");
        autor2.setEmail("YuTsu@gmail.com");
        autor2.setCpf("123.456.789-10"); 
        autor2.mostrarDetalhes();

        Livro Manga = new Livro(autor2);
        Manga.setNome("Shoukegeki no soma");
        Manga.setDescricao("Shokugeki no Soma conta a história de um garoto chamado Sōma Yukihira, cujo sonho é se tornar um chef em tempo integral no restaurante de seu pai e superar suas habilidades culinárias.");
        Manga.setIsbn("978-85-66250-46-6");        
        Manga.setValor(23.90);    
        Manga.mostrarDetalhes();
       

        Autor autor3 = new Autor();
        autor3.setNome("Yuu Kamiya");
        autor3.setEmail("YuuKa@gmail.com");
        autor3.setCpf("123.456.789-10");
        autor3.mostrarDetalhes();


        Livro Anime = new Livro(autor3);
        Anime.setNome("No game No life");
        Anime.setDescricao("No game no life é uma série de light novels japonesa escrita por Yuu Kamiya e ilustrada por Mashiro Hiiragi. A série é publicada pela Media Factory desde 30 de janeiro de 2012, com 12 volumes compilados até o momento.");
        Anime.setIsbn("978-85-66250-46-6");       
        Anime.setValor(59.90);
    
        Anime.mostrarDetalhes();

        //ebook
        Autor autor4 = new Autor();
        autor4.setNome("Makoto Shinkai");
        autor4.setEmail("MakotoShink@gmail.com");
        autor4.setCpf("123.456.789-10");
        autor4.mostrarDetalhes();
        Ebook ebook = new Ebook(autor4);

        ebook.setNome("Notonoha no Niwa");
        ebook.setDescricao("Notonoha no Niwa é uma série de light novels japonesa escrita  Makoto Shinkai e ilustrado Midori Motobashi, conta a historia de um casal que se conhece em um jardim de flores.");
        ebook.setIsbn("978-85-66250-46-6");
        ebook.setValor(16.00);
        ebook.setWaterMark("Notonoha no Niwa");
        ebook.mostrarDetalhes();



        
        
    }

}