package vsu.cs.ru.lesson2;

public class Task2 {

    public static void main(String[] args) {
        Passport passport = new Passport();
        int result = passport.checkAge(45);

        // Неудобно работать с возвращаемым значением
        // Сложно поддерживать код
        // Нужно держать в памяти сопоставления чисел и необходимых действий
        System.out.println(result);

        // Вызываем расширенный метод
        PassportAction passportAction = passport.extendedCheckAge(45);
        // Возвращаемое значение даёт полное представление о результате выполнения метода.
        System.out.println(passportAction);
    }
}
