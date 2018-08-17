import java.lang.Class;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class AutoGrader {
    public static void main(String[] args) {
        // Run all of the unit tests for the BCC
        String author = BreastCancerClassify.author();
        Class test_class = BreastCancerClassifyTest.class;
        Result result = JUnitCore.runClasses(test_class);
        int total_tests = result.getRunCount();
        double successful_tests = total_tests - result.getFailureCount();
        String student_score = String.format("%.2f", (successful_tests / total_tests));
        System.out.println(author + " : " + student_score);
    }
}
