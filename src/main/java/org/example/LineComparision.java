package org.example;


import java.util.Arrays;
import java.util.Objects;

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

        public int compareTo(LineComparision other) {
            double thisLength = this.length();
            double otherLength = other.length();
            return Double.compare(thisLength, otherLength);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LineComparision)) {
                return false;
            }
            LineComparision other = (LineComparision) obj;
            return Double.compare(this.x1, other.x1) == 0 &&
                    Double.compare(this.y1, other.y1) == 0 &&
                    Double.compare(this.x2, other.x2) == 0 &&
                    Double.compare(this.y2, other.y2) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x1, y1, x2, y2);
        }



        public static void main(String[] args) {
            LineComparision line1 = new LineComparision(1.0, 2.0, 3.0, 4.0);
            LineComparision line2 = new LineComparision(1.0, 2.0, 4.0, 6.0);
            LineComparision line3 = new LineComparision(1.0, 2.0, 3.0, 4.0);

            System.out.println("Comparing line1 and line2: " + line1.compareTo(line2)); // -1 (line1 < line2)
            System.out.println("Comparing line2 and line1: " + line2.compareTo(line1)); // 1 (line2 > line1)
            System.out.println("Comparing line1 and line3: " + line1.compareTo(line3)); // 0 (line1 == line3)
        }
    }
