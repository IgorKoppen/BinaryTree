package fiap.com.br.tree;

public class BinaryTreeV2 {

    private class ARVORE {
        int dado;
        ARVORE dir, esq;

    }

    public ARVORE root = null;

    public void init(int info) {
        root = new ARVORE();
        root.dado = info;
    }

    public ARVORE inserir(ARVORE p, int info) {
        if (p == null) {
            p = new ARVORE();
            p.dado = info;
            p.esq = null;
            p.dir = null;
        } else if (info < p.dado)
            p.esq = inserir(p.esq, info);
        else
            p.dir = inserir(p.dir, info);
        return p;
    }

    public void listaEmOrdem(ARVORE p) {
        if (p != null) {
            listaEmOrdem(p.esq);
            System.out.println("Dado: " + p.dado);
            listaEmOrdem(p.dir);
        }
    }

    public int contaNos(ARVORE p, int cont) {
        if (p != null) {
            cont++;
            cont = contaNos(p.esq, cont);
            cont = contaNos(p.dir, cont);
        }
        return cont;
    }

    public boolean consulta(ARVORE p, int info) {
        if (p == null) {
            return false;
        } else {
            if (p.dado == info) {
                return true;
            } else {
                if (info < p.dado) {
                    return consulta(p.esq, info);
                } else {
                    return consulta(p.dir, info);
                }
            }
        }
    }

    public int contaConsulta(ARVORE p, int info, int cont) {
        if (p != null) {
            cont++;
            if (p.dado == info)
                return cont;
         else {
            if (p.dado < info)
                cont = contaConsulta(p.esq, info, cont);
             else
                 cont = contaConsulta(p.dir, info, cont);
            }
        }
        return cont;
    }

}
