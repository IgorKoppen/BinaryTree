package fiap.com.br.test;

import fiap.com.br.tree.BinaryTree;
import fiap.com.br.tree.BinaryTreeV2;

public class MainTest {
    public static void main(String[] args) {
        BinaryTreeV2 tree2 = new BinaryTreeV2();

        tree2.init(20);
        tree2.inserir(tree2.root ,15);
        tree2.inserir(tree2.root ,10);
        tree2.inserir(tree2.root ,35);
        tree2.inserir(tree2.root, 30);
        tree2.listaEmOrdem(tree2.root);

        System.out.println("Quantidade de nos da ABB " + tree2.contaNos(tree2.root, 0));

        if(tree2.consulta(tree2.root,40)){
            System.out.println("tem na ABB");
        }else{
            System.out.println("Não tem na ABB");
        }
        System.out.println(tree2.contaConsulta(tree2.root,30, 0));
    }
}
