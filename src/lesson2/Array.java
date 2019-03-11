package lesson2;

import lesson2.customexc.MyArrayDataException;
import lesson2.customexc.MySizeArrayException;

class Array {

    private String[][] arr = new String[4][4];

    void searchOfTwoDimensionArray(String[][] array) throws MySizeArrayException, MyArrayDataException {
        int count = 0;
        if (4 != array.length) throw new MySizeArrayException();
        for (int i = 0; i < arr.length; i++) {
            if (4 != array[i].length) throw new MySizeArrayException();
            for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = array[i][j];
                    try {
                        count += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException ex) {
                        throw new MyArrayDataException(i, j);
                    }
            }
            System.out.println();
        }
        printOfArray();
        System.out.println("\n Сумма элементов массива: " + count + "\n");
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
}
