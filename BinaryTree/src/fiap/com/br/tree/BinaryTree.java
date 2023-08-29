package fiap.com.br.tree;

public class BinaryTree {
    private class TREE {
        int data;
        TREE left = null;
        TREE right = null;
    }

    public static int contador = 0;
    private TREE root = null;

    public void preOrdem() {
        if (root != null) {
            preOrdemPrint(root);
        }
    }

    private void preOrdemPrint(TREE p) {
        if (p != null) {
            System.out.println("Dado: " + p.data);
            if (p.left != null)
                preOrdemPrint(p.left);
            if (p.right != null) ;
            preOrdemPrint(p.right);
        }
    }

    public void inOrdem() {
        if (root != null) {
            inOrdemPrint(root);
        }
    }

    private void inOrdemPrint(TREE p) {
        if (p != null) {
            if (p.left != null)
                inOrdemPrint(p.left);
            System.out.println("Dado: " + p.data);
            if (p.right != null)
                inOrdemPrint(p.right);
        }
    }

    public void posOrdem() {
        if (root != null) {
            posOrdemPrint(root);
        }
    }

    private void posOrdemPrint(TREE p) {
        if (p != null) {
            if (p.left != null)
                posOrdemPrint(p.left);
            if (p.right != null)
                posOrdemPrint(p.right);
            System.out.println("dado: " + p.data);
        }
    }

    public void insert(int data) {
        if (root == null) {
            root = new TREE();
            root.data = data;
        } else {
            insertInTree(root, data);
        }
    }

    private TREE insertInTree(TREE p, int data) {
        if (p == null) {
            p = new TREE();
            p.data = data;
        } else if (data < p.data)
            p.left = insertInTree(p.left, data);
        else
            p.right = insertInTree(p.right, data);
        return p;
    }

}
