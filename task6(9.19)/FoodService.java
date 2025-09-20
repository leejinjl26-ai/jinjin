package task6;

import java.time.LocalDate;
import java.util.List;

public class FoodService {
    private final FoodDAO dao;

    public FoodService(FoodDAO dao) {
        this.dao = dao;
    }

    public void register(String itemNo, String itemName, int quantity, LocalDate regDate) {
        FoodDTO dto = new FoodDTO(itemNo, itemName, quantity, regDate);
        dao.save(dto);
    }

    public List<FoodDTO> getAll() {
        return dao.findAll();
    }
}