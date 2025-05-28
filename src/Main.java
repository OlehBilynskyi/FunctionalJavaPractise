//Імпортуємо стандартні функціональні інтерфейси
//Використаємо інтерфейс java.util.function.Function щоб перетворювати одне значення на інше (наприклад String->Integer)

import java.util.function.Function;
//Інтерфейс який нічого не приймає, але повертає значення типу T, коли викликається метод get(),
//наприклад для генерації випадкового числа
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
//1. Анонімний клас для додавання
//Створюємо змінну типу MathOperation з ім'ям addition,
//та присвоюємо їй об'єкт анонімного класу, який реалізує метод operate
        //Перевизначаємо метод operate, що приймає два аргументи a і b, та повертаємо результат додавання a + b
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
//Викликаємо метод operate з аргументами 5 і 3, та зберігаємо результат у змінну resultAddition
        int resultAddition = addition.operate(5, 3);

        System.out.println("Addition result (5 + 3): " + resultAddition);

//2. Лямбда вираз для переведення рядка у верхній регістр
        //Створюємо змінну типу StringManipulator з ім'ям toUpper
        //Присвоюємо їй лямбда-вираз, який приймає рядок s і повертає результат s.toUpperCase
        StringManipulator toUpper = s -> s.toUpperCase();
//Викликаємо метод manipulate для рядка "hello world", зберігаємо результат у upperString
        String upperString = toUpper.manipulate("hello world");

        System.out.println("Uppercase string: " + upperString);
//3. Використання method reference до статичного методу
        //Створюємо об'єкт типу Function, який приймає String і повертає Integer
        //Присвоюємо йому посилання на метод StringListProcessor.countUppercase
        Function<String, Integer> countUpper = StringListProcessor::countUppercase;
//Викликаємо метод apply для рядка "HeLLo WoRLD!", результат зберігаємо в uppercaseCount,
//та виводимо кількість великих літер
        int uppercaseCount = countUpper.apply("HeLLo WoRLD!");

        System.out.println("Number of uppercase letters: " + uppercaseCount);

//4. Supplier для генерації випадкового числа від 1 до 100
        //Створюємо об'єкт типу Supplier<Integer>, який не приймає аргументів
        //Лямбда-вираз викликає метод generateRandomNumber з параметрами 1 і 100
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);

//Викликаємо метод get() постачальника, зберігаємо результат у randomValue та виводимо згенероване випадкове число
        int randomValue = randomSupplier.get();

        System.out.println("Random number (1-100): " + randomValue);
    }
}