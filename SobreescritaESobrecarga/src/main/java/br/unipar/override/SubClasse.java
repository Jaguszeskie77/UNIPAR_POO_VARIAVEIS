package br.unipar.override;

public class SubClasse extends SuperClasse {

    @Override
    public void imprime() {
        System.out.println("imprime diferente");
    }

    @Override
    public void ligar(){
        System.out.println("ligado!!!");
    }
}

