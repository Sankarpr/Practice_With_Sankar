package generics;

import java.util.Arrays;

public class CustomArrayType <T>{
    private Object[] data;

    private static int DEFAULT_SIZE=10;
    private int size= 0;

    public void CustomeArrayList() {
        data=new Object[DEFAULT_SIZE];
    }

    public void add(T num)
    {
        if(isFull())
        {
            resize();
        }
        data[size++]=num;
    }
    public T remove()
    {
        T removed = (T)data[--size];
        return removed;
    }
    public T get(int index)
    {
        return (T)data[index];
    }
    public  int size()
    {
        return size;
    }
    public void set(int index, T value)
    {
        data[index] = value;
    }

    private void resize()
    {
        Object[] temp = new Object[data.length * 2];

        //copy the current item into the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data=temp;
    }
    private boolean isFull()
    {
        return size==data.length;
    }


    @Override
    public String toString()
    {
        return "CustomeArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" +size +
                '}';

    }
    public static void main(String[] args) {
        /*ArrayList list= new ArrayList();
        list.add(34);
        list.remove(0);
        list.add(0,78);
        list.getClass();
        list.size();
        list.get(0);*/
        CustomeArrayList list = new CustomeArrayList();
        list.add(3);
        list.add(9);
        list.add(12);
        System.out.println(list);
    }
}
