package lesson2;

import java.util.ArrayList;

class Array {
    private ArrayList<String> arrError = new ArrayList<>();
    private String[][] arr = new String[4][4];

    void searchOfTwoDimensionArray(String[][] array){
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                try {
                    arr[i][j] = array[i][j];
                    try {
                        count += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException ex) {
                        arrError.add("В ячейке [" + i + "," + j + "] лежат данные, которые не могут быть преобразованы!;");
                    }
                }catch (IndexOutOfBoundsException|NullPointerException ex){
                    ex.printStackTrace();
                }
            }
            System.out.println();
        }
        printOfArray();
        System.out.println("\n Сумма элементов массива: " + count + "\n");
        printErrorOfArray();
    }

    private void printOfArray(){
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (arr[i][j] == null){
                    arr[i][j] = "";
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void printErrorOfArray(){
        for (String errorString : arrError) {
            System.out.println(errorString);
        }
    }
}
