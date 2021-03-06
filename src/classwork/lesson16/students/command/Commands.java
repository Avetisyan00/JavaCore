package classwork.lesson16.students.command;

public interface Commands {

    int LOGOUT = 0;
    int ADD_STUDENT = 1;
    int PRINT_ALL_STUDENTS = 2;
    int DELETE_STUDENT_BY_INDEX = 3;
    int PRINT_STUDENTS_BY_LESSON_NAME = 4;
    int PRINT_STUDENTS_COUNT = 5;
    int CHANGE_STUDENTS_LESSON = 6;
    int ADD_LESSON = 7;
    int PRINT_ALL_LESSONS = 8;
    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;

    static void printUserCommands() {
        System.out.println("Input " + LOGOUT + " to Logout");
        System.out.println("Input " + ADD_STUDENT + " to add student");
        System.out.println("Input " + PRINT_ALL_STUDENTS + " to print all students");
        System.out.println("Input " + PRINT_STUDENTS_BY_LESSON_NAME + " to show students by lesson");
        System.out.println("Input " + PRINT_STUDENTS_COUNT + " to print students count");
        System.out.println("Input " + PRINT_ALL_LESSONS + " to print all lessons");

    }

    static void printAdminCommands() {
        System.out.println("Input " + LOGOUT + " to Logout");
        System.out.println("Input " + ADD_STUDENT + " to add student");
        System.out.println("Input " + PRINT_ALL_STUDENTS + " to print all students");
        System.out.println("Input " + DELETE_STUDENT_BY_INDEX + " to delete student by index");
        System.out.println("Input " + PRINT_STUDENTS_BY_LESSON_NAME + " to show students by lesson");
        System.out.println("Input " + PRINT_STUDENTS_COUNT + " to print students count");
        System.out.println("Input " + CHANGE_STUDENTS_LESSON + " to change student's lesson");
        System.out.println("Input " + ADD_LESSON + " to add lesson");
        System.out.println("Input " + PRINT_ALL_LESSONS + " to print all lessons");

    }

    static void printLoginCommands() {
        System.out.println("Input " + EXIT + " to exit");
        System.out.println("Input " + LOGIN + " to login");
        System.out.println("Input " + REGISTER + " to register");
    }
}
