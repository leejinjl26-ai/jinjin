package task6;

import java.util.List;

public class AnimalService {
    private final AnimalDAO dao;

    public AnimalService(AnimalDAO dao) {
        this.dao = dao;
    }

    public void register(String id, String ownerName, String petName, int petAge, String contact) {
        AnimalDTO dto = new AnimalDTO(id, ownerName, petName, petAge, contact);
        dao.save(dto);
    }

    public List<AnimalDTO> getAll() {
        return dao.findAll();
    }
}
