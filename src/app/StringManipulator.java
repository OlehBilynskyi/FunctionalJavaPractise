package app;

@FunctionalInterface
//Створюємо публічний інтерфейс для обробки рядків
public interface StringManipulator {
    //Абстрактний метод, який повертає рядок s і повертає результат обробки цього рядка
    String manipulate(String s);
}
