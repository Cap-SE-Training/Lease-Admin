public class Leasecompany {
    private String id;

    public Leasecompany() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
}
