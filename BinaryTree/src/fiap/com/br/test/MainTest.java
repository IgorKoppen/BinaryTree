package fiap.com.br.test;

import fiap.com.br.tree.BinaryTree;
import fiap.com.br.tree.BinaryTreeV2;

public class MainTest {
    public static void main(String[] args) {
        BinaryTreeV2 tree2 = new BinaryTreeV2();

        tree2.init(30);
        tree2.inserir(tree2.root ,20);
        tree2.inserir(tree2.root ,25);
        tree2.inserir(tree2.root ,40);
        tree2.listaEmOrdem(tree2.root);

        System.out.println("Quantidade de nos da ABB " + tree2.contaNos(tree2.root, 0));
    }
}
