package lesson2.customexc;

public class MySizeArrayException extends IndexOutOfBoundsException {

    public MySizeArrayException(){
        super("Массив должен быть размерностью 4x4");
    }
}
