public class RandomNumberGenerator {
    //Створюємо статичний метод, який приймає межі min і max
    public static int generateRandomNumber(int min, int max) {
//Math.random() генерує число від 0.0 до 1.0 (не включаючи 1.0), множимо на (max - min + 1) щоб отримати діапазон,
        //потім додаємо min і проводимо результат до цілого типу (int)
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}