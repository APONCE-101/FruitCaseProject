public class TernaryPractice {

    public static void main(String[] args) {
        int inputCal = 1000;
        int goal = 500;
        int calsResult = inputCal >= goal ? 1 : 0;

        System.out.println(calsResult);

        // Extra Credit
        String student = "Dumbledore";
        // if student is a witch or wizard, they are admitted
        String admission = student.equals("witch") || student.equals("wizard") ? "Admission approved" : "Admission denied";

        System.out.println(admission);




    }
}

