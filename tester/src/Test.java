public class Test {
    public static void main(String[] args) {
        int passmark = 12;
        boolean passed = false;
        int[] scores = {4, 6, 2, 8, 12, 35, 9};
        for (int unitScore: scores) {
            if (unitScore >= passmark) {
                passed = true;
                break;
            }
        }
        System.out.println("At least one passed? " + passed);
    }
}
