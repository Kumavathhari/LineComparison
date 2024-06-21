package org.example;


public class LineComparision {
        private double x1, y1, x2, y2;

        // Constructor to initialize the endpoints
        public LineComparision(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        // Method to calculate the length of the line
        public double length() {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }


        public static void main(String[] args) {
            // Example points
            double x1 = 1.5, y1 = 2.0;
            double x2 = 4.2, y2 = 6.3;

            // Create a line object
            LineComparision line = new LineComparision(x1, y1, x2, y2);

            // Calculate the length of the line
            double length = line.length();

            // Output the result
            System.out.println("Length of the line: " + length);
        }
    }

