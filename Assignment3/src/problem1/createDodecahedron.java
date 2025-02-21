package problem1;
import java.util.*;

public class createDodecahedron {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the edge length: ");
        int edgeLength = scanner.nextInt();
        Dodecahedron d1 = new Dodecahedron(edgeLength);
        System.out.println(d1);
        System.out.println("Volume: " + d1.getVolume());
        System.out.println("Surface Area: " + d1.getSurfaceArea());
        System.out.println("Height: " + d1.getHeight());
        scanner.close();
    }

}
