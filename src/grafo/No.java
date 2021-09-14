package grafo;

import java.util.ArrayList;
import java.util.List;

public class No {
    protected final String ID;
    //protected double value = Double.MAX_VALUE;
    protected final List<Arestas> arestas = new ArrayList<Arestas>();

    public No(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    //public double getValue() { return value; }

    public List getArestas(){
        return arestas;
    }

    public void addArestas(No n){
        arestas.add(new Arestas(n));
        n.arestas.add(new Arestas(this));
    }


}