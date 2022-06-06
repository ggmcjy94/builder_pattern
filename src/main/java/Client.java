public class Client {

    public static void main(String[] args) {
        Member member = new Builder("hyunseok")
                .age(25)
                .country("korea")
                .job("Student")
                .build();

    }
}
