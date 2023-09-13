package vsu.cs.ru.lesson2;

public class Passport {

    /**
     * Получить информацию о необходимых действиях при достижении n-лет
     *
     * @param age возраст человека
     * @return 0 - действия не нужны
     * 1 - получение паспорта (14 лет)
     * 2 - замена паспорта (20, 45 лет)
     */
    public int checkAge(int age) {
        int result = 0;
        if (age == 14) {
            result = 1;
        } else if (age == 20 || age == 45) {
            result = 2;
        }
        return result;
    }

    /**
     * Получить информацию о необходимых действиях при достижении n-лет
     *
     * @param age возраст человека
     * @return действие, необходимое для выполнения
     */
    public PassportAction extendedCheckAge(int age) {
        PassportAction result = PassportAction.NO_ACTION_REQUIRED;
        if (age == 14) {
            result = PassportAction.GETTING_PASSPORT;
        } else if (age == 20 || age == 45) {
            result = PassportAction.PASSPORT_RENEWAL;
        }
        return result;
    }
}
