package task6;
import java.util.List;

public class HealthService {
    private final HealthDAO dao;

    public HealthService(HealthDAO dao) {
        this.dao = dao;
    }

    public void register(String memberName, int memberNo, int baseCalorie, int burnCalorie) {
        HealthDTO dto = new HealthDTO(memberName, memberNo, baseCalorie, burnCalorie);
        dao.save(dto);
    }

    public List<HealthDTO> getAll() {
        return dao.findAll();
    }
}