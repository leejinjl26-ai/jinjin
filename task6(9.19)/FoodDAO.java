package task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodDAO {
    private final List<FoodDTO> store = new ArrayList<>();

    public void save(FoodDTO dto) {
        store.add(dto);
    }

    public List<FoodDTO> findAll() {
        return Collections.unmodifiableList(store);
    }
}