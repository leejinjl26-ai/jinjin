package task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalDAO {
    private final List<AnimalDTO> store = new ArrayList<>();

    public void save(AnimalDTO dto) {
        store.add(dto);
    }

    public List<AnimalDTO> findAll() {
        return Collections.unmodifiableList(store);
    }
}
