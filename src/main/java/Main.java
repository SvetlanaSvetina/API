public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Хуанита";
        post.passport = "1234 № 12345678";
        post.patronymic = "Санчес";
        post.phone = "+54 (011) 4307-4457";
        post.surname = "Лопес";
        post.subscription = "true";


        post.birthday = new FormDate();
        post.birthday.date = 11;
        post.birthday.month = 3;
        post.birthday.year = 1990;

        System.out.println(post.birthday.date);
        System.out.println(post.birthday.month);
        System.out.println(post.birthday.year);

        System.out.println(post.name);
        System.out.println(post.passport);
        System.out.println(post.patronymic);
        System.out.println(post.phone);
        System.out.println(post.surname);
        System.out.println(post.subscription);

    }
}