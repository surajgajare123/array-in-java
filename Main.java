// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Array in java!");
        // Frist method to create array in java
        int [] marks = new int[5];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 45;
        marks[3] = 53;
        marks[4] = 44;
        System.out.println(marks[2]); // declaration + memory allocation
        // second method to create an array in java
        int [] makrs; // declaration 
        makrs = new int[3];//  memory allocation
        makrs[0] = 1;
        makrs[1] = 2;
        makrs[2] = 4;
        System.out.println(makrs[2]);
        
        int [] student = {12, 33, 55, 23, 66, 44};// declare + initalize
        System.out.println(student[2]);
    }
}
