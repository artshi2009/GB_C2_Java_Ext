package lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{{";)"},
                                            {"7", ":о"},
                                            {"9", "3", ":)"},
                                            {"1", "13", "5", ":("}};

        Array arr = new Array();

        arr.searchOfTwoDimensionArray(array);
    }
}
