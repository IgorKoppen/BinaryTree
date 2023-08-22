package fiap.com.br.tree;

public class BinaryTreeV2 {

    private class ARVORE{
        int dado;
        ARVORE dir,esq;

    }
    public ARVORE root = null;

    public ARVORE inserir(ARVORE p , int info){
        if(p == null){
            p = new ARVORE();
            p.dado = info;
            p.esq = null;
            p.dir = null;
        }else if (info < p.dado)
            p.esq = inserir(p.esq, info);
        else
            p.dir = inserir(p.dir, info);
        return p;
    }
  public void listaEmOrdem(ARVORE p){
        if (p!=null){
            listaEmOrdem(p.esq);
            System.out.println("Dado: " + p.dado);
            listaEmOrdem(p.dir);
        }
  }
}
