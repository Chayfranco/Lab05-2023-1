package ordenadores;

public class OrdenarPorSelecao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }
            int t = array[menor];
            array[menor] = array[i];
            array[i] = t;
        }
        return array;
    } 
}