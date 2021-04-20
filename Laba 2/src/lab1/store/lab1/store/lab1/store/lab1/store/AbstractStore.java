package lab1.store.lab1.store.lab1.store.lab1.store;

import java.util.Arrays;

public class AbstractStore {
    protected Object[] arr = new Object[3];
    protected int count = 0;
    public Object[] getArr(){
        return Arrays.copyOf(arr, count);
    }

    public int getCount() {
        return count;
    }
    public void add(Object newObject){
        if(arr.length==count)
            arr=Arrays.copyOf(arr, count+count/2);
        arr[count++]=newObject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<count; i++)
            sb.append(arr[i].toString() + ("\n"));
        return  sb.toString();
    }
}
