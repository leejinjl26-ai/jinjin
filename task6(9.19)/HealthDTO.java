package task6;

public class HealthDTO {
    private String memberName;   // 회원명
    private int memberNo;        // 회원번호
    private int baseCalorie;     // 기준칼로리
    private int burnCalorie;     // 소비칼로리

    public HealthDTO() {}

    public HealthDTO(String memberName, int memberNo, int baseCalorie, int burnCalorie) {
        this.memberName = memberName;
        this.memberNo = memberNo;
        this.baseCalorie = baseCalorie;
        this.burnCalorie = burnCalorie;
    }

    public String getMemberName() { return memberName; }
    public int getMemberNo() { return memberNo; }
    public int getBaseCalorie() { return baseCalorie; }
    public int getBurnCalorie() { return burnCalorie; }

    public void setMemberName(String memberName) { this.memberName = memberName; }
    public void setMemberNo(int memberNo) { this.memberNo = memberNo; }
    public void setBaseCalorie(int baseCalorie) { this.baseCalorie = baseCalorie; }
    public void setBurnCalorie(int burnCalorie) { this.burnCalorie = burnCalorie; }

    @Override
    public String toString() {
        int net = baseCalorie - burnCalorie;
        return "[회원명=" + memberName +
               ", 회원번호=" + memberNo +
               ", 기준칼로리=" + baseCalorie +
               ", 소비칼로리=" + burnCalorie +
               ", 순칼로리(기준-소비)=" + net + "]";
    }
}