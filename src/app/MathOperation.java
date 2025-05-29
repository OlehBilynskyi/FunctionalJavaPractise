package app;

//Оголошуємо функціональний інтерфейс (має лише один абстрактний метод)
@FunctionalInterface
public interface MathOperation {
    //Абстрактний метод operate приймає два цілих числа a і b, повертає ціле число
    int operate(int a, int b);
}
