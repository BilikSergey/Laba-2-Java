package lab1.store.lab1.store.lab1.store.lab1.store;

import lab1.model.lab1.model.lab1.model.IWeight;

import java.util.Arrays;

public class ProductStore extends AbstractStore
{
    public Object[] getArr() {
        return Arrays.copyOf(arr, count);
    }

    public void add(IWeight newProduct){
        if (arr.length == count) {
            arr = Arrays.copyOf(arr, count + count / 2);
        }
        arr[count++] = newProduct;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Вміст сховища продуктів\n");
        for (int i = 0; i < count; i++) {
            sb.append(arr[i]).append("\n");
        }
        return sb.toString();
    }
}
