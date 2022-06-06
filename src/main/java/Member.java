public class Member {

    private String name;
    private int age;
    private String job;
    private String gender;
    private String country;


    Member(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.job = builder.job;
        this.gender = builder.gender;
        this.country = builder.country;
    }


    public static class Builder {

        private String name;
        private int age;
        private String job;
        private String gender;
        private String country;


        public Builder name(String name) {
            this.name = name;
            return this;
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

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
