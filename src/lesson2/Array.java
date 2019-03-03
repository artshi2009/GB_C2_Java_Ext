package lesson2;

import java.util.ArrayList;

class Array {
    private ArrayList<String> arrError = new ArrayList<>();

    void searchDimensionArray(String[][] array){
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                String arr = array[i][j];
                System.out.print(arr + " ");
                try {
                    count += Integer.parseInt(arr);
                }catch (NumberFormatException ex){
                    arrError.add("В ячейке ["+ i +"," + j + "] лежат данные, которые не могут быть преобразованы!;");
                }
            }
            System.out.println();
        }
        System.out.println("\n Сумма элементов массива: " + count + "\n");
        printErrorOfArray();
    }

    private void printErrorOfArray(){
        for (String errorString : arrError) {
            System.out.println(errorString);
        }
    }
}
