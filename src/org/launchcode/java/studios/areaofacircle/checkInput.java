package org.launchcode.java.studios.areaofacircle;

public class checkInput {
    public checkInput(String radius){
        while (true) {
            System.out.print("Enter a radius: ");

            if (radius.isEmpty()) {
                System.out.println("Error: Input cannot be empty");
                return;
            }

            try {
                double radius1 = Double.parseDouble(radius);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a numeric value.");
                return;
            }

            break;
        }
    }
}
