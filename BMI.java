public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;


    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }


    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }


    public double getBMI() {
        return weight * 703 / (height * height);
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25.0)
            return "Normal";
        else if (bmi < 30.0)
            return "Overweight";
        else
            return "Obese";
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }


    public static void main(String[] args) {
        BMI b1 = new BMI("Ahmed", 25, 160, 70);
        System.out.println("The BMI for " + b1.getName() + " is "
                + String.format("%.2f", b1.getBMI()) + " " + b1.getStatus());

        BMI b2 = new BMI("Amina", 215, 70);
        System.out.println("The BMI for " + b2.getName() + " (age " + b2.getAge() + ") is "
                + String.format("%.2f", b2.getBMI()) + " " + b2.getStatus());
    }
}