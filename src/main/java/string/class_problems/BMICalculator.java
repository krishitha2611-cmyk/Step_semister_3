package string.class_problems;

public class BMICalculator {

    static String getBmiStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        double[] heights = {1.75, 1.60, 1.68, 1.82, 1.55};
        double[] weights = {70, 90, 62, 85, 45};

        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < heights.length; i++) {

            double bmi = weights[i] / (heights[i] * heights[i]);

            System.out.printf("%d\t%.2f\t%.1f\t%.2f\t%s\n",
                    i + 1,
                    heights[i],
                    weights[i],
                    bmi,
                    getBmiStatus(bmi));
        }
    }
}