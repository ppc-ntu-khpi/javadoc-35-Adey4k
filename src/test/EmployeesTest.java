package test;

import domain.*;

/**
 * Клас {@code EmployeesTest} виконує тестування роботи з різними типами працівників
 * (художниками, редакторами, менеджерами) шляхом створення об'єктів та виведення їхніх характеристик.
 * 
 * Тестує можливість створення об'єктів різних типів та перевіряє їхнє правильне представлення
 * за допомогою перевизначеного методу {@link Object#toString()}.
 */
public class EmployeesTest {

    /**
     * Головний метод програми, який створює кілька об'єктів працівників (Редактор, Художник, Менеджер)
     * та виводить інформацію про менеджера та його підлеглих.
     *
     * @param args параметри командного рядка (не використовуються в даному класі)
     */
    public static void main(String args[]) {

        // Створення масиву навичок для редагування
        String[] skills = {"Microsoft Word", "TeX", "OpenOffice", "Markdown"};

        // Створення об'єкта редактора
        Editor ed = new Editor(true, skills, "Phil Coulson", "Chief Editor", 3, "Publishing");

        // Створення об'єкта працівника
        Employee em = new Employee("Melinda May", "Assistant", 1, "Publishing");

        // Створення об'єкта художника
        Artist art = new Artist(skills);

        // Створення масиву працівників для менеджера
        Employee[] people = {ed, em, art};

        // Створення об'єкта менеджера з підлеглими
        Manager man = new Manager(people, "Steve Ballmer", "CEO", 3, "Publishing");

        // Виведення інформації про менеджера
        System.out.println(man);
    }
}
