package domain;

/**
 * Клас {@code Editor} представляє редактора, який є підкласом {@link Artist}.
 * Додає інформацію про тип редагування — електронне або паперове.
 */
public class Editor extends Artist {

    /**
     * Визначає, чи редактор віддає перевагу електронному редагуванню.
     */
    private boolean electronicEditing;

    /**
     * Конструктор з повним набором параметрів.
     *
     * @param electronicEditing перевага електронного редагування
     * @param skiils масив навичок
     * @param name ім'я редактора
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор з параметрами редагування і навичками.
     *
     * @param electronicEditing перевага електронного редагування
     * @param skiils масив навичок
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор з параметром редагування.
     *
     * @param electronicEditing перевага електронного редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор без параметрів.
     * За замовчуванням електронне редагування встановлено в {@code true}.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення редактора з інформацією про тип редагування.
     *
     * @return рядок з інформацією про редактора
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;
    }

    /**
     * Повертає уподобання редактора щодо типу редагування.
     *
     * @return {@code true}, якщо електронне редагування; {@code false} — паперове
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює уподобання редактора щодо типу редагування.
     *
     * @param electronic {@code true} для електронного редагування, {@code false} для паперового
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
