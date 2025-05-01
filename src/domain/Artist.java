package domain;

/**
 * Представляє художника як підклас співробітника.
 * Зберігає навички художника у вигляді масиву рядків.
 */
public class Artist extends Employee {

    /**
     * Масив навичок художника.
     */
    private String[] skiils;

    /**
     * Конструктор з усіма параметрами.
     *
     * @param skiils масив навичок
     * @param name ім'я співробітника
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор з навичками.
     *
     * @param skiils масив навичок
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Конструктор без параметрів.
     * Ініціалізує навички масивом на 10 елементів.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає рядкове представлення об'єкта Artist, включаючи навички.
     *
     * @return рядок з інформацією про співробітника і навички
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }

    /**
     * Повертає навички як рядок, розділений комами.
     *
     * @return навички у вигляді одного рядка
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює навички художника.
     *
     * @param skills масив нових навичок
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    /**
     * Повертає навички у вигляді масиву.
     *
     * @return масив навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
