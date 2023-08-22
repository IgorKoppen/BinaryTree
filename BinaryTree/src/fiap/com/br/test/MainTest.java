package fiap.com.br.test;

import fiap.com.br.tree.BinaryTree;
import fiap.com.br.tree.BinaryTreeV2;

public class MainTest {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinaryTreeV2 tree2 = new BinaryTreeV2();

        tree.insert(6);
        tree.insert(4);
        tree.insert(10);
        tree.insert(7);


        tree.inOrdem();

        tree2.root = tree2.inserir(tree2.root, 6);
        tree2.inserir(tree2.root ,4);
        tree2.inserir(tree2.root ,10);
        tree2.inserir(tree2.root ,7);
        tree2.listaEmOrdem(tree2.root);
    }
}
