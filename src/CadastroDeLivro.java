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
        System.out.println("Nome: " + livro.nome);
        System.out.println("Descrição: " + livro.descricao);
        System.out.println("Valor: " + livro.valor);
        System.out.println("ISBN: " + livro.isbn);
        System.out.println("Categoria: " + livro.categoria);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Editora: " + livro.editora);
        System.out.println("O livro " + livro.nome + " foi adicionado ao estoque");
        //segundo livro
        livro = new Livro();
        livro.nome = "O Senhor dos Anéis";
        livro.descricao = "O Senhor dos Anéis é uma trilogia de livros de fantasia escrita por J. R. R. Tolkien. A trilogia é composta por O Hobbit, O Senhor dos Anéis e O Silmarillion. O Senhor dos Anéis é uma sequência direta de O Hobbit, e conta a história de Frodo Bolseiro, um hobbit que recebe de seu tio Bilbo um anel mágico, o Um Anel, que pertenceu ao poderoso Sauron, o Senhor do Escuro. Sauron deseja recuperar o anel para recuperar o seu poder e dominar a Terra-média. Frodo, com a ajuda de um grupo de amigos, deve destruir o anel antes que Sauron o recupere.";
        livro.valor = 59.90;
        livro.isbn = "978-85-7522-480-7";
        livro.categoria = "Fantasia";
        livro.autor = "J. R. R. Tolkien";
        livro.editora = "JBC";
        System.out.println("Nome: " + livro.nome);
        System.out.println("Descrição: " + livro.descricao);
        System.out.println("Valor: " + livro.valor);
        System.out.println("ISBN: " + livro.isbn);
        System.out.println("Categoria: " + livro.categoria);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Editora: " + livro.editora);
        System.out.println("O livro " + livro.nome + " foi adicionado ao estoque");
    }

}