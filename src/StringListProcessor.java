public class StringListProcessor {
    //Створюємо метод який приймає рядок і рахує великі літери
    public static int countUppercase(String s) {
//Оголошуємо змінну count для зберігання кількості великих літер (початкове значення 0)
        int count = 0;
//Перетворюємо рядок у масив символів і проходимо по кожному символу
        for (char c : s.toCharArray()) {
//Якщо символ є великою літерою, то збільшуємо лічильник
            if (Character.isUpperCase(c)) {


                count++;
            }
        }
//Повертаємо кількість великих літер
        return count;
    }
}