public class CadastroDeLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Toradora!";
        livro.descricao = "Toradora! é uma série de light novel escrita por Yuyuko Takemiya e ilustrada por Yasu. A série possui dez volumes, os quais foram lançados entre 10 de março de 2006 e 10 de março de 2009. A história segue a vida de Ryuuji Takasu, um garoto mal-encarado, mas de bom coração, que começa o seu segundo ano do colégio conhecendo a Taiga Aisaka, uma garota baixinha, porém de temperamento feroz, e que é temida por todos pela alcunha de “Tigresa de Bolso";
        livro.valor = 59.90;
        livro.isbn = "978-85-7522-480-7";
        livro.categoria = "Romance";
        livro.autor = "Yuyuko Takemiya";
        livro.editora = "JBC";
        livro.mostrarDetalhes();

        Livro outroLivro = new Livro();
        outroLivro.nome = "No Game No Life";
        outroLivro.descricao = "No Game No Life é uma série de light novel japonesa escrita por Yuu Kamiya e ilustrada por Mashiro Hiiragi. A série possui 10 volumes, os quais foram lançados entre 10 de março de 2012 e 10 de março de 2014. A história segue a vida de Sora e Shiro, dois irmãos que são considerados os melhores jogadores de jogos de tabuleiro do mundo. Eles são convidados por Deus para participar de um jogo que decidirá o futuro da humanidade.";
        outroLivro.valor = 29.90;
        outroLivro.isbn = "978-85-7522-480-7";
        outroLivro.categoria = "Aventura";
        outroLivro.autor = "Yuu Kamiya";
        outroLivro.editora = "JBC";
        outroLivro.mostrarDetalhes();
        
    }

}