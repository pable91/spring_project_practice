package spp.core.member;

public class AdminMember implements Member{

    private int id = 0;
    String name = null;

    public AdminMember(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
