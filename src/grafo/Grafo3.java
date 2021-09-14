package grafo;

import java.util.ArrayList;
import java.util.List;

public class Grafo3 {
    public static List<No> buildGraph() {
        No a = new No("A");
        No b = new No("B");
        No c = new No("C");
        No d = new No("D");
        No e = new No("E");
        No f = new No("F");
        No g = new No("G");

        a.addArestas(b);
        a.addArestas(g);
        a.addArestas(c);
        a.addArestas(f);

        //b para a
        b.addArestas(c);


        //c para a
        //c para b
        c.addArestas(d);


        //d para c
        d.addArestas(e);


        //e para d
        e.addArestas(f);
        e.addArestas(g);

        //f para a
        //f para e
        f.addArestas(g);

        //g para a
        //g para e
        //g para f



        List<No>grafo =new ArrayList<No>();
        grafo.add(a);
        grafo.add(b);
        grafo.add(c);
        grafo.add(d);
        grafo.add(e);
        grafo.add(f);
        grafo.add(g);

        return grafo;
    }
}
