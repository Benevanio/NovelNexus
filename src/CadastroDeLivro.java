public class CadastroDeLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Toradora!";
        livro.descricao = "Toradora! é uma série de light novel escrita por Yuyuko Takemiya e ilustrada por Yasu. A série possui dez volumes, os quais foram lançados entre 10 de março de 2006 e 10 de março de 2009. A história segue a vida de Ryuuji Takasu, um garoto mal-encarado, mas de bom coração, que começa o seu segundo ano do colégio conhecendo a Taiga Aisaka, uma garota baixinha, porém de temperamento feroz, e que é temida por todos pela alcunha de “Tigresa de Bolso";
        livro.valor = 59.90;
        livro.isbn = "978-85-7522-480-7";
        livro.categoria = "Romance";
        Autor autor1 = new Autor();
        autor1.nome = "Yuyuko Takemiya";
        autor1.email = "YuYuko1989@gmail.com";
        autor1.cpf = "123.456.789-10";
        livro.autor = autor1;
        autor1.mostrarDetalhesAutor();

        livro.mostrarDetalhes();

        Livro outroLivro = new Livro();
        outroLivro.nome = "No Game No Life";
        outroLivro.descricao = "No Game No Life é uma série de light novel japonesa escrita por Yuu Kamiya e ilustrada por Mashiro Hiiragi. A série possui 10 volumes, os quais foram lançados entre 10 de março de 2012 e 10 de março de 2014. A história segue a vida de Sora e Shiro, dois irmãos que são considerados os melhores jogadores de jogos de tabuleiro do mundo. Eles são convidados por Deus para participar de um jogo que decidirá o futuro da humanidade.";
        outroLivro.valor = 29.90;
        outroLivro.isbn = "978-85-7522-480-7";
        outroLivro.categoria = "Aventura";
        outroLivro.editora = "JBC";
        Autor autor = new Autor();
        autor.nome = "Yuu Kamiya";
        autor.email = "Yuka@gmail.com";
        autor.cpf = "123.456.789-10";
        livro.autor = autor;
        autor.mostrarDetalhesAutor();
        outroLivro.mostrarDetalhes();

        Livro maisUmLivro = new Livro();
        maisUmLivro.nome = "Kimi no Na wa";
        maisUmLivro.descricao = "Kimi no Na wa (君の名は。, lit. Your Name.) é um filme japonês de 2016, dirigido por Makoto Shinkai e produzido pela CoMix Wave Films. É baseado no romance de mesmo nome de Shinkai, lançado em 2006. O filme foi lançado em 26 de agosto de 2016, e arrecadou mais de 30 bilhões de ienes (US$ 270 milhões) em todo o mundo, tornando-se o filme de animação mais lucrativo de todos os tempos.";
        maisUmLivro.valor = 29.90;
        maisUmLivro.isbn = "978-85-7522-480-7";
        maisUmLivro.categoria = "Romance";
        maisUmLivro.editora = "JBC";
        Autor autor2 = new Autor();
        autor2.nome = "Makoto Shinkai";
        autor2.email = "MakotoShinka@gmail.com";
        autor2.cpf = "123.456.789-10";
        livro.autor = autor2;
        autor2.mostrarDetalhesAutor();
        maisUmLivro.mostrarDetalhes();

    }

}