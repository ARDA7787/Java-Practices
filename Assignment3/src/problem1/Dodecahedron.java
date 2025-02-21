package problem1;

import java.util.*;

public class Dodecahedron {
    private static int nextId = 1;
    private int id;
    private double edge;
    
    public Dodecahedron() {
        this.id = nextId++;
        this.edge = 1.0; // Default edge length
    }
    
    public Dodecahedron(int edge) {
        this.id = nextId++;
        this.edge = edge;
    }
    
    public int getId() {
        return id;
    }
    
    public double getEdge() {
        return edge;
    }
    
    public void setEdge(double edge) {
        this.edge = edge;
    }
    
    public double getVolume() {
        return (15 + 7 * Math.sqrt(5)) / 4 * Math.pow(edge, 3);
    }
    
    public double getSurfaceArea() {
        return 3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(edge, 2);
    }
    
    public double getHeight() {
        return (Math.sqrt(3) + Math.sqrt(15)) / 2 * edge;
    }
    
    @Override
    public String toString() {
        return "Dodecahedron ID: " + id + ", Edge: " + edge;
    }
    
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