package task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HealthDAO {
    private final List<HealthDTO> store = new ArrayList<>();

    public void save(HealthDTO dto) { store.add(dto); }

    public List<HealthDTO> findAll() {
        return Collections.unmodifiableList(store);
    }
}