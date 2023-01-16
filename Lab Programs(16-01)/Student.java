import java.util.Scanner;

class Student {
    String name;
    int marks[] = new int[6];
    int total;
    float percentage;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        name = sc.nextLine();
        System.out.println("Enter marks for 6 subjects:");
        for (int i = 0; i < 6; i++) {
            marks[i] = sc.nextInt();
        }
    }

    void checkMarks() throws Exception {
        for (int i = 0; i < 6; i++) {
            if (marks[i] < 0 || marks[i] > 50) {
                throw new Exception("Invalid marks entered");
            }
        }
    }

    void findTotal() {
        for (int i = 0; i < 6; i++) {
            total += marks[i];
        }
    }

    void findPercentage() {
        percentage = (total / 6.0f) * 100;
    }

    void printMarkSheet() {
        System.out.println("Name: " + name);
        System.out.println("Marks in each subject:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage);
    }
}

class Stud {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        try {
            s.checkMarks();
            s.findTotal();
            s.findPercentage();
            s.printMarkSheet();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
