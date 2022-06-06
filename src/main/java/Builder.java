public class Builder {

    private String name;
    private int age;
    private String job;
    private String gender;
    private String country;


    public Builder(String name) {
        this.name = name;
    }
    public Builder age(int age) {
        this.age = age;
        return this;
    }
    public Builder job(String job) {
        this.job = job;
        return this;
    }
    public Builder gender(String gender) {
        this.gender = gender;
        return this;
    }
    public Builder country(String country) {
        this.country = country;
        return this;
    }
    public Member build() {
        return new Member(this);
    }

}
