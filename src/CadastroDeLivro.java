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
        }

}