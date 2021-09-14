import grafo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Grafo1 grafo1 = new Grafo1();
        List primeiro = grafo1.buildGraph();

        Grafo2 grafo2 = new Grafo2();
        List segundo = grafo2.buildGraph();

        Grafo3 grafo3 = new Grafo3();
        List terceiro = grafo3.buildGraph();

        Grafo4 grafo4 = new Grafo4();
        List quarto = grafo4.buildGraph();

        ArrayList<List> grafos = new ArrayList<>();
        grafos.add(primeiro);
        grafos.add(segundo);
        grafos.add(terceiro);
        grafos.add(quarto);

        boolean dirac = true;

//
//        for (int i = 0; i < primeiro.size(); i++) {
//            No aux = (No) primeiro.get(i);
//            if(!(aux.getArestas().size()>=(Math.round(primeiro.size()/2)))){
//                //System.out.println("atende");
//                dirac = false;
//            }
//        }
//        if(dirac == false){
//            System.out.println("não atende a dirac");
//        }else{
//            System.out.println("atende a dirac");
//        }


        for(int i = 0; i<grafos.size();i++){
            dirac = true;

            for (int j = 0; j < grafos.get(i).size(); j++) {
                No aux = (No) grafos.get(i).get(j);
                //System.out.println(aux.getArestas().size());
                if(!(aux.getArestas().size()>=((float)grafos.get(i).size()/2))){
                    //System.out.println("não atende");
                    dirac = false;
                }
            }
            System.out.print("grafo "+(i+1)+" ");
            if(dirac == false){
                System.out.println("não atende a dirac");
            }else{
                System.out.println("atende a dirac");
            }
        }




    }
}
