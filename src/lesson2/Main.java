package lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "й", "3", "4"},
                                            {"1", "2", "3", "q"},
                                            {"q", "2", "q", "4"},
                                            {"1", "2", "3", "q"}};

        Array arr = new Array();

        try {
            arr.searchDimensionArray(array);
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }
}
