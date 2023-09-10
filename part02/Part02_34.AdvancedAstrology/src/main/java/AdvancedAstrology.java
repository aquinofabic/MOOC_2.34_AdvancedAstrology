
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        int height = size;
        while (i <= size) {
            printSpaces(height--);
            printStars(i++);
            System.out.println("");
        }

    }

    public static void christmasTree(int height) {
        int stars = 1;
        int spaces = height - 1;
        int baseSpace = height - 2;


        for (int i = 0; i < height; i++) {
            printSpaces(spaces);
            spaces--;
            printStars(stars);
            stars+=2;
            System.out.println("");
        }
        for (int i = 0; i< 2; i++) {
            printSpaces(baseSpace);
            printStars(3);
            System.out.println("");

        }

    }


    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}