package pl.krejzolekpro.byobjects.objects;

public class User {

    private String name;
    private Integer amount;

    public User(String name){
        this.name = name;
        this.amount = 0;
        UserUtil.addUser(this);
    }

    public String getName() {
        return name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
