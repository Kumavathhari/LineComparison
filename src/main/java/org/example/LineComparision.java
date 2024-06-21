package org.example;


import java.util.Arrays;

public class LineComparision {

    private double x1, y1, x2, y2;

    public LineComparision(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public boolean equals(LineComparision other) {
        // Check both direct and reverse order of endpoints
        double[] thisEndpoints = {x1, y1, x2, y2};
        double[] otherEndpoints = {other.x1, other.y1, other.x2, other.y2};

        Arrays.sort(thisEndpoints);
        Arrays.sort(otherEndpoints);

        return Arrays.equals(thisEndpoints, otherEndpoints);
    }


    public static void main(String[] args) {
        LineComparision line1 = new LineComparision(1.0, 2.0, 3.0, 4.0);
        LineComparision line2 = new LineComparision(1.0, 2.0, 3.0, 4.0);
        LineComparision line3 = new LineComparision(3.0, 4.0, 1.0, 2.0);

        System.out.println("line1 equals line2: " + line1.equals(line2));
        System.out.println("line1 equals line3: " + line1.equals(line3));

    }
}


