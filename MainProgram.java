import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  // Очистка консоли.
        TeacherController teacherController = new TeacherController(new ArrayList<>());

        // Добавление учителей в список
        teacherController.create("Иван", "Иванович", "Иванов");
        teacherController.create("Василий", "Васильевич", "Васильев");
        teacherController.create("Пётр", "Петрович", "Петров");
        teacherController.printStudentList();   // Вывод списка в консоль

        // Сортировка по ФИО
        System.out.println("\nСортировка по ФИО");
        teacherController.printStudentList(teacherController.sortTeacherList());

        // Редактирование списка
        System.out.println("\nМеняем ФИО");
        teacherController.editTeacher(1, "Яков", "Яковлевич", "Яковлев");
        teacherController.printStudentList();

        // Сортировка по ФИО
        System.out.println("\nСортировка по ФИО");
        teacherController.printStudentList(teacherController.sortTeacherList());
    }
}
