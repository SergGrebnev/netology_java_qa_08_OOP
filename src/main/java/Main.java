public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Сергей";
        post.passport = "1234 № 12345678";
        post.phone = "8-913-000-00-79";
        post.patronymic = "Николаевич";
        post.surname = "Гребнев";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 11;
        post.birthday.year = 1990;
    }
}
