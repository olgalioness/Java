package HomeWorkOOP3.Task2;

import HomeWorkOOP3.Task1.IsLike;

/*
Написать метод, который рефлексивно проверит наличие аннотации @IsLike на любом переданном классе и выведет значение,
хранящееся в аннотации, на экран.
 */
public class Main {
    public static void main(String[] args) {
        check(LikeClass.class);
        check(NotLikeClass.class);
        check(SimpleClass.class);
    }

    public static void check(Class<?> cls) {
        if (!cls.isAnnotationPresent(IsLike.class)) {
            System.out.println("Annotation not found");
            return;
        }
        IsLike isLike = cls.getAnnotation(IsLike.class);
        System.out.println("IsLike: " + isLike.value());
    }
}
//проверяем у класса представлена ли анотоция и выводим на экран
