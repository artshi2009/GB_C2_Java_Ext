package lesson5;

class CreateMyArrays implements Runnable {
    private final int size = 10000000;

    void createArray1(){
        float[] arr = new float[size];
        createArr(arr);
        long a = System.currentTimeMillis();
        reCreateArr(arr);
        System.out.println("Время вычисления для 1-го метода: " + (System.currentTimeMillis() - a) + " мс");
    }

    void createWithThreadArray2(){
        float[] arr = new float[size];
        int h = size / 2;
        float [] array1 = new float[h];
        float [] array2 = new float[h];
        createArr(arr);
        System.arraycopy(arr, 0, array1, 0, h);
        System.arraycopy(arr, h, array2, 0, h);

        long a = System.currentTimeMillis();
        new Thread(() -> {
            float[] a1 = reCreateArr(array1);
            System.arraycopy(a1, 0, array1, 0, a1.length);
        }).start();

        new Thread(() -> {
            float[] a2 = reCreateArr(array2);
            System.arraycopy(a2, 0, array2, 0, a2.length);
        }).start();

        System.arraycopy(array1, 0, arr, 0, h);
        System.arraycopy(array2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a + " мс");
    }

    private void createArr(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
    }

    private float[] reCreateArr(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5f) * Math.cos(0.2f + i / 5f) * Math.cos(0.4f + i / 2f));
        }
        return array;
    }


    @Override
    public void run() {
    }
}
