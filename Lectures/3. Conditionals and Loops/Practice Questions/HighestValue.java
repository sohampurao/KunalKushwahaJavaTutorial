package PracticeQuestions;
// Q: Find the highest marks scored by student from a "marks" Array.

public class HighestValue {

    public static void main(String[] args) {
        // Declaring and Initializing Marks Array
        double[] marks = {94.56, 88.53, 99.31, 96.51, 97.48, 200};

        // Passing marks array to max_marks method
        double highestMarks = max_marks(marks);
        System.out.println("The highest marks scored by a student: " + highestMarks + "%");
    }

    /**
     * Method to find the maximum marks from an array using a for loop.
     *
     * @param marks array of student marks
     * @return the highest mark
     */
    // static double max_marks(double[] marks) {
    //     double max_num = marks[0];
    //     for (int i = 0; i < marks.length; i++) {
    //         if (marks[i] > max_num) {
    //             max_num = marks[i];
    //         }
    //     }
    //     return max_num;
    // }

    /**
     * Method to find the maximum marks from an array using an enhanced for loop.
     *
     * @param marks array of student marks
     * @return the highest mark
     */
    // static double max_marks(double[] marks) {
    //     double max_marks = marks[0]; // Initial sample value
    //     for (double mark : marks) {
    //         if (mark > max_marks) {
    //             max_marks = mark;
    //         }
    //     }
    //     return max_marks;
    // }

    /**
     * Method to find the maximum marks from an array using a while loop.
     *
     * @param marks array of student marks
     * @return the highest mark
     */
    // static double max_marks(double[] marks) {
    //     double max_marks = marks[0];
    //     int i = 0;
    //     while (i < marks.length) {
    //         if (marks[i] > max_marks) {
    //             max_marks = marks[i];
    //         }
    //         i++;
    //     }
    //     return max_marks;
    // }

    /**
     * Method to find the maximum marks from an array using a do-while loop.
     *
     * @param marks array of student marks
     * @return the highest mark
     */
    static double max_marks(double[] marks) {
        double max_mark = marks[0];
        int i = 0;
        do {
            if (marks[i] > max_mark) {
                max_mark = marks[i];
            }
            i++;
        } while (i < marks.length);
        return max_mark;
    }
}
