package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    public int[] merge(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int z = 0;
            while (i < array1.length && j < array2.length) {
                if (array1[i] < array2[j]) {
                    array[z++] = array1[i++];
                } else {
                    array[z++] = array2[j++];
                }
            }
            while (i < array1.length) {
                array[z++] = array1[i++];
            }
            while (j < array2.length) {
                array[z++] = array2[j++];
            }
            return array;
        }
    }
    

