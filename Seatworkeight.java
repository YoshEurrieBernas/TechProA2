public class Seatworkeight {

    public static void main(String args[]) {
        int grade = 3;

        switch (grade) {
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
            case 3: // Fall-through from case 2 if grade was 2
                System.out.println("Well done");
                break;
            case 4:
            case 5: // Fall-through from case 4 if grade was 4
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}