public class Main {

    public static void main(String[] args) {
        System.out.println("Rose is " + convertToCentimeters(5,4) + " CM tall!");
        System.out.println("Tom is " + convertToCentimeters(6,11) + " CM tall!");
        System.out.println("Carl is " + convertToCentimeters(5,11) + " CM tall!");
        System.out.println("Sarah is " + convertToCentimeters(65) + " CM tall!");

    }

    public static double convertToCentimeters(int inches){
        double centemeters = (inches * 2.54);
        return centemeters;
    }

    public static double convertToCentimeters(int feet, int inches){
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return convertToCentimeters(totalInches);
    }

}
