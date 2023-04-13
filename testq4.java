/*Q4. Print the sum, difference and product of two complex numbers by creating a class named
'Complex' with separate methods for each operation whose real and imaginary parts are
entered by user.. */

import java.util.Scanner;

class Complex {
     double realPart;
     double imaginaryPart;

    // Constructor with real and imaginary parts as parameters
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Method to add two complex numbers and return the result as a new complex number
    public Complex add(Complex other) {
        double realSum = this.realPart + other.realPart;
        double imaginarySum = this.imaginaryPart + other.imaginaryPart;
        return new Complex(realSum, imaginarySum);
    }

    // Method to subtract two complex numbers and return the result as a new complex number
    public Complex subtract(Complex other) {
        double realDiff = this.realPart - other.realPart;
        double imaginaryDiff = this.imaginaryPart - other.imaginaryPart;
        return new Complex(realDiff, imaginaryDiff);
    }

    // Method to multiply two complex numbers and return the result as a new complex number
    public Complex multiply(Complex other) {
        double realProduct = (this.realPart * other.realPart) - (this.imaginaryPart * other.imaginaryPart);
        double imaginaryProduct = (this.realPart * other.imaginaryPart) + (this.imaginaryPart * other.realPart);
        return new Complex(realProduct, imaginaryProduct);
    }

    // Method to print the complex number
    public void printComplex() {
        System.out.println("Complex Number: " + this.realPart + " + " + this.imaginaryPart + "i");
    }
}

public class testq4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the real part of the first complex number: ");
            double realPart1 = scanner.nextDouble();
            System.out.print("Enter the imaginary part of the first complex number: ");
            double imaginaryPart1 = scanner.nextDouble();

            System.out.print("Enter the real part of the second complex number: ");
            double realPart2 = scanner.nextDouble();
            System.out.print("Enter the imaginary part of the second complex number: ");
            double imaginaryPart2 = scanner.nextDouble();

            Complex complex1 = new Complex(realPart1, imaginaryPart1); // Creating first complex number
            Complex complex2 = new Complex(realPart2, imaginaryPart2); // Creating second complex number

            Complex sum = complex1.add(complex2); // Adding two complex numbers
            Complex difference = complex1.subtract(complex2); // Subtracting two complex numbers
            Complex product = complex1.multiply(complex2); // Multiplying two complex numbers

            System.out.println("Sum: ");
            sum.printComplex();
            System.out.println("Difference: ");
            difference.printComplex();
            System.out.println("Product: ");
            product.printComplex();
        }
    }
}
