import java.util.*;

public class Grader{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i +=1) {
            int grade = Integer.parseInt(scan.nextLine());
            int nextMultipleOf5 = (5 - grade % 5) + grade;
            if (grade < 38) {
                System.out.println(grade);
            }
            else if (nextMultipleOf5 - grade < 3) {
                System.out.println(nextMultipleOf5);
            }
            else {
                System.out.println(grade);
            }

}
}
}





