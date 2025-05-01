package domain;

/**
 * Клас {@code Employee} представляє співробітника з базовими характеристиками,
 * такими як ім'я, посада, рівень, відділ та унікальний ідентифікатор.
 */
public class Employee {

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

    /**
     * Конструктор з усіма параметрами (окрім ID, який генерується автоматично).
     *
     * @param name ім'я співробітника
     * @param jobTitle посада
     * @param level рівень (1–3)
     * @param dept відділ
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор без параметрів. Генерує випадковий ID для співробітника.
     */
    public Employee() {
        ID = (int)(Math.random() * 1000);
        // Обмеження ID відключене
    }

    /**
     * Повертає рядкове представлення об'єкта {@code Employee}.
     *
     * @return рядок з інформацією про співробітника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID +
               "\nName= " + name +
               "\nJobTitle= " + jobTitle +
               "\nLevel= " + level +
               "\nDept= " + dept;
    }

    /**
     * Встановлює посаду співробітника.
     *
     * @param job назва посади
     */
    public void setJobTitle(String job) {
        this.jobTitle = job;
    }

    /**
     * Повертає назву посади.
     *
     * @return посада
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я співробітника.
     *
     * @return ім'я
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень співробітника.
     * Дозволені значення — 1, 2, 3. Усі інші значення автоматично замінюються на 1.
     *
     * @param level рівень співробітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень співробітника.
     *
     * @return рівень
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає назву відділу.
     *
     * @return відділ
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює назву відділу.
     *
     * @param dept назва відділу
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я співробітника.
     * Якщо ім’я не відповідає шаблону (лише літери, дозволені розділові знаки та пробіли), встановлюється "John Doe".
     *
     * @param name ім’я співробітника
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
