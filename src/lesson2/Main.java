package lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{  {";)"},
                                            {"7", ":о"},
                                            {"9", "3", ":)"},
                                            {"1", "13", "5", ":("}  };

        String[][] array2 = new String[][]{ {";)", "2", "3", "3"},
                                            {"7", ":о", "4", "3"},
                                            {"9", "3", ":)", "3"},
                                            {"1", "13", "5", ":("}  };

        String[][] array3 = new String[][]{ {"13", "0", "3", "3"},
                                            {"7", "5", "17", "3"},
                                            {"9", "3", "15", "3"},
                                            {"1", "13", "5", "11"}  };

        Array arr = new Array();

        arr.searchOfTwoDimensionArray(array3);
    }
}
