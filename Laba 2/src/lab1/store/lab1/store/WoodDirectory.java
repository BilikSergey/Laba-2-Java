package lab1.store.lab1.store;

import lab1.model.lab1.model.Wood;
import lab1.store.lab1.store.lab1.store.lab1.store.AbstractStore;

import java.util.Arrays;

public class WoodDirectory extends AbstractStore {
    {
        arr[0] = new Wood(1, "Модрина", 1.1f);
        arr[1] = new Wood(2, "Ялина", 0.9f);
        arr[2] = new Wood(3, "Сосна", 0.7f);
        count = 3;
    }

    public Object[] getArr() {
        return Arrays.copyOf(arr, count);
    }

    public Wood get(int id) {
        for (int i = 0; i < count; i++) {
            Wood wood = (Wood) arr[i];
            if (wood.getId() == id)
                return wood;
        }
        return null;
    }

    public boolean add(Wood newWood) {
        if (get(newWood.getId()) != null)
            return false;
        super.add(newWood);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Каталог деревини:\n");
        for (int i = 0; i < count; i++) {
            sb.append(arr[i]).append("\n");
        }
        return sb.toString();
    }
}
