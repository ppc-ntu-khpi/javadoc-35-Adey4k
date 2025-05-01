package domain;

/**
 * Клас {@code Manager} представляє менеджера, який є працівником,
 * що керує іншими працівниками (масивом об'єктів {@link Employee}).
 * 
 * Наслідує властивості класу {@link Employee} і додає можливість зберігати
 * підлеглих працівників.
 */
public class Manager extends Employee {

    /**
     * Конструктор створює менеджера з повними даними.
     *
     * @param employees масив працівників, якими керує менеджер
     * @param name ім'я менеджера
     * @param jobTitle посада менеджера
     * @param level рівень менеджера (1–3)
     * @param dept відділ, до якого належить менеджер
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає строкове представлення менеджера, включаючи перелік працівників.
     *
     * @return рядок з інформацією про менеджера та його працівників
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees(); 
    }

    /**
     * Конструктор створює менеджера з вказаним списком працівників, без персональних даних.
     *
     * @param employees масив працівників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор за замовчуванням створює менеджера з пустим масивом з 10 працівників.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /** Масив працівників, якими керує менеджер */
    private Employee[] employees;

    /**
     * Повертає імена всіх працівників у вигляді одного рядка.
     *
     * @return імена працівників, розділені комами
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2); // видалення останньої коми
        return s;
    }

    /**
     * Встановлює список працівників.
     *
     * @param employees масив об'єктів {@link Employee}
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив працівників.
     *
     * @return масив {@link Employee}
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
