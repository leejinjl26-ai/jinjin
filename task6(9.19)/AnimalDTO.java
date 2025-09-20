package task6;

public class AnimalDTO {
    private String id;           // 아이디
    private String ownerName;    // 보호자명
    private String petName;      // 반려 동물명
    private int petAge;          // 반려 동물 나이
    private String contact;      // 연락처

    public AnimalDTO() {}

    public AnimalDTO(String id, String ownerName, String petName, int petAge, String contact) {
        this.id = id;
        this.ownerName = ownerName;
        this.petName = petName;
        this.petAge = petAge;
        this.contact = contact;
    }

    public String getId() { return id; }
    public String getOwnerName() { return ownerName; }
    public String getPetName() { return petName; }
    public int getPetAge() { return petAge; }
    public String getContact() { return contact; }

    public void setId(String id) { this.id = id; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setPetName(String petName) { this.petName = petName; }
    public void setPetAge(int petAge) { this.petAge = petAge; }
    public void setContact(String contact) { this.contact = contact; }

    @Override
    public String toString() {
        return "[아이디=" + id +
               ", 보호자명=" + ownerName +
               ", 반려동물명=" + petName +
               ", 나이=" + petAge +
               ", 연락처=" + contact + "]";
    }
}

