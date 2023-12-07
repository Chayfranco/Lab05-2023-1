import ordenadores.OrdenarPorMerge;

import ordenadores.OrdenarPorSelecao;

public class Main {
            public static void main(String[] args) {
            int[] array = {5,3,2,4,7,1,0,6};
            OrdenarPorSelecao o = new OrdenarPorSelecao();
            int [] array2 = o.ordene(array);
            for (int i: array2){
                System.out.println(i);
            }
            

            int[] array3 = {7,9,15,17,20};
            int [] array4 = {0,1,2,22,30};
            OrdenarPorMerge m = new OrdenarPorMerge();
            int[] r = m.merge(array4, array3);
            for (int i : r){
                System.out.println(i);
            }
        }
}