package ordenadores;
public class OrdenarPorInsercao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        for (int i = 1; i < array.length; i++){
            int t = i;
            for (int j = i - 1; j >= 0; j--){
                if(array[t] < array[j]){
                    int x = array[t];
                    array[t] = array[j];
                    array[j] = x;
                t--;
                } else{
                    break;
                }
            }
        }

        return array;
    }
    
}
