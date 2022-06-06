public class Client {

    public static void main(String[] args) {
        Member member = new Member.Builder()
                .name("hyunseok")
                .age(25)
                .country("korea")
                .build();

        System.out.println(member);


    }
}
