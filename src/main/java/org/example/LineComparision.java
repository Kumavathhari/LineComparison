package org.example;


import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.Objects;

public class LineComparision implements Comparable<LineComparision> {
        private Point start;
        private Point end;

        public LineComparision(Point start, Point end) {
            this.start = start;
            this.end = end;
        }

        public double length() {
            return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
        }

        @Override
        public int compareTo(LineComparision other) {
            return Double.compare(this.length(), other.length());
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            LineComparision line = (LineComparision) obj;
            return start.equals(line.start) && end.equals(line.end);
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }

    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(3.0, 4.0);
        Point p3 = new Point(4.0, 6.0);

        LineComparision line1 = new LineComparision(p1, p2);
        LineComparision line2 = new LineComparision(p1, p3);
        LineComparision line3 = new LineComparision(p1, p2);

        System.out.println("Comparing line1 and line2: " + line1.compareTo(line2)); // -1 (line1 < line2)
        System.out.println("Comparing line2 and line1: " + line2.compareTo(line1)); // 1 (line2 > line1)
        System.out.println("Comparing line1 and line3: " + line1.compareTo(line3)); // 0 (line1 == line3)

        System.out.println("line1 equals line2: " + line1.equals(line2)); // false
        System.out.println("line1 equals line3: " + line1.equals(line3)); // true
    }
}

