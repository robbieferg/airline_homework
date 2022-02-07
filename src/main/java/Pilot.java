public class Pilot {
    private String name;
    private Rank rank;
    private String licenceNo;

    public Pilot(String name, Rank rank, String licenceNo) {
        this.name = name;
        this.rank = rank;
        this.licenceNo = licenceNo;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return this.rank;
    }

    public String getLicenceNo() {
        return this.licenceNo;
    }

}
