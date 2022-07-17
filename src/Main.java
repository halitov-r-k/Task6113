import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        LOGGER.log(Level.INFO, "Начало программы.");
        DynamicArray dynamicArray = new DynamicArray();
        LOGGER.log(Level.INFO, "Размер созданного массива: {0}",dynamicArray.array.length);
        LOGGER.log(Level.INFO, "Позиция: {0}",dynamicArray.count);
        String el0 = "Элемент0";
        String el1 = "Элемент1";
        String el2 = "Элемент2";
        String el3 = "Элемент3";
        String el4 = "Элемент4";
        String el5 = "Элемент5";
        String el6 = "Элемент6";
        String el7 = "Элемент7";
        String el8 = "Элемент8";
        String el9 = "Элемент9";
        String el10 = "Элемент10";
        dynamicArray.add(el0);
        dynamicArray.add(el1);
        dynamicArray.add(el2);
        dynamicArray.add(el3);
        dynamicArray.add(el4);
        dynamicArray.add(el5);
        dynamicArray.add(el6);
        dynamicArray.add(el7);
        dynamicArray.add(el8);
        dynamicArray.add(el9);
        dynamicArray.add(el10);


        LOGGER.log(Level.INFO, "Размер массива: {0}",dynamicArray.array.length);
        LOGGER.log(Level.INFO, "Позиция: {0}",dynamicArray.count);

       // System.out.println(dynamicArray.get(9));

        for (int i = 0; i < dynamicArray.count; i++ ) { System.out.print(dynamicArray.get(i)+", "); }
        System.out.println();
            dynamicArray.remove(7);
        for (int i = 0; i < dynamicArray.count; i++ ) { System.out.print(dynamicArray.get(i)+", "); }
   }

    public static class DynamicArray<T> {
        int count;
        T[] array;

        public  DynamicArray () {
            this.count = 0;
            this.array = (T[]) new Object[16];
        }

        void add(T el){

            if (count == array.length) {
                array =  Arrays.copyOf(array, count*2);
            }
            array[count]= el; LOGGER.log(Level.INFO, "add: {0}", el);
            count++;    LOGGER.log(Level.INFO, "count: {0}", count);
        }

        void remove(int index) {
            for(int i=index; i < count; i++) {
                array[i] = array[i+1];
            }
            count--;
            LOGGER.log(Level.INFO, "remove : {0}", index);
            LOGGER.log(Level.INFO, "remove : {0}", array[index]);
        }

        T get(int index) {
            if((index <0) || (index >= count)) throw  new ArrayIndexOutOfBoundsException ("Индекс вне диапазона");
            return array[index];
        }
    }
}