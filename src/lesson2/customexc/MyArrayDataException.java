package lesson2.customexc;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int i, int j){
        super("В ячейке [" + (i + 1) + "," + (j + 1) + "] лежат данные, которые не могут быть преобразованы!;");
    }


}
