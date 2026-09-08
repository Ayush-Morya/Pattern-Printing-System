import java.util.Scanner;

public class PatternPrintingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starPatternCount = 0, numberPatternCount = 0, alphabetPatternCount = 0, advancedPatternCount = 0;
        System.out.println("\n===================================");
        System.out.println("Welcome to Pattern Printing System");
        System.out.println("===================================");
        int printAgainChoice;
        do {
            int patternChoice = categoryMenu(scanner);
            switch (patternChoice) {
                case 1 -> starPatternCount = handleStarPatterns(scanner, patternChoice, starPatternCount);
                case 2 -> numberPatternCount = handleNumberPatterns(scanner, patternChoice, numberPatternCount);
                case 3 -> alphabetPatternCount = handleAlphabetPatterns(scanner, patternChoice, alphabetPatternCount);
                case 4 -> advancedPatternCount = handleAdvancedPatterns(scanner, patternChoice, advancedPatternCount);
            }
            printAgainChoice = printAgainMenu(scanner);
        } while (printAgainChoice == 1);
        printReport(starPatternCount, numberPatternCount, alphabetPatternCount, advancedPatternCount);
    }
    static int categoryMenu(Scanner scanner) {
        int patternChoice;
        do {
            System.out.println("\nChoose Pattern Category:\n");
            System.out.println("1. Star Patterns");
            System.out.println("2. Number Patterns");
            System.out.println("3. Alphabet Patterns");
            System.out.println("4. Advanced Patterns\n");
            System.out.print("Enter your choice: ");
            patternChoice = scanner.nextInt();
            if (patternChoice < 1 || patternChoice > 4) {
                System.out.println("Invalid pattern category choice! Please choose a valid option.");
            }
        } while (patternChoice < 1 || patternChoice > 4);
        return patternChoice;
    }
    static int starMenu(Scanner scanner) {
        int starChoice;
        do {
            System.out.println("\n-------Star Patterns-------\n");
            System.out.println("1. Right Triangle");
            System.out.println("2. Left Triangle");
            System.out.println("3. Pyramid");
            System.out.println("4. Inverted Triangle");
            System.out.println("5. Diamond");
            System.out.println("6. Hollow Square");
            System.out.println("7. Hollow Rectangle");
            System.out.println("8. Hollow Right Triangle\n");
            System.out.print("Enter your choice: ");
            starChoice = scanner.nextInt();
            if (starChoice < 1 || starChoice > 8) {
                System.out.println("Invalid star pattern choice! Please choose a valid option.");
            }
        } while (starChoice < 1 || starChoice > 8);
        return starChoice;
    }
    static int numberMenu(Scanner scanner) {
        int numberChoice;
        do {
            System.out.println("\n-------Number Patterns-------\n");
            System.out.println("1. Number Triangle");
            System.out.println("2. Reverse Number Triangle");
            System.out.println("3. Repeating Number Triangle");
            System.out.println("4. Floyd's Triangle");
            System.out.println("5. Number Pyramid");
            System.out.println("6. Palindrome Number Pyramid\n");
            System.out.print("Enter your choice: ");
            numberChoice = scanner.nextInt();
            if (numberChoice < 1 || numberChoice > 6) {
                System.out.println("Invalid number pattern choice! Please choose a valid option.");
            }
        } while (numberChoice < 1 || numberChoice > 6);
        return numberChoice;
    }
    static int alphabetMenu(Scanner scanner) {
        int alphabetChoice;
        do {
            System.out.println("\n-------Alphabet Patterns-------\n");
            System.out.println("1. Alphabet Triangle");
            System.out.println("2. Reverse Alphabet Triangle");
            System.out.println("3. Repeating Alphabet Triangle");
            System.out.println("4. Continuous Alphabet Triangle");
            System.out.println("5. Alphabet Pyramid\n");
            System.out.print("Enter your choice: ");
            alphabetChoice = scanner.nextInt();
            if (alphabetChoice < 1 || alphabetChoice > 5) {
                System.out.println("Invalid alphabet pattern choice! Please choose a valid option.");
            }
        } while (alphabetChoice < 1 || alphabetChoice > 5);
        return alphabetChoice;
    }
    static int advancedMenu(Scanner scanner) {
        int advancedChoice;
        do {
            System.out.println("\n-------Advanced Patterns-------\n");
            System.out.println("1. Butterfly Pattern");
            System.out.println("2. Concentric Number Square Pattern");
            System.out.println("3. Consecutive Number Pyramid");
            System.out.println("4. Ascending Number Pyramid");
            System.out.println("5. Binary Triangle Pattern\n");
            System.out.print("Enter your choice: ");
            advancedChoice = scanner.nextInt();
            if (advancedChoice < 1 || advancedChoice > 5) {
                System.out.println("Invalid advanced pattern choice! Please choose a valid option.");
            }
        } while (advancedChoice < 1 || advancedChoice > 5);
        return advancedChoice;
    }
    static int printAgainMenu(Scanner scanner) {
        int printAgainChoice;
        do {
            System.out.println("\nDo you want to print another pattern?");
            System.out.println("1. Yes");
            System.out.println("2. No\n");
            System.out.print("Enter your choice: ");
            printAgainChoice = scanner.nextInt();
            if (printAgainChoice != 1 && printAgainChoice != 2) {
                System.out.println("Invalid choice! Please enter 1 or 2.");
            }
        } while (printAgainChoice != 1 && printAgainChoice != 2);
        return printAgainChoice;
    }
    static int handleStarPatterns(Scanner scanner, int patternChoice, int starPatternCount) {
        int starChoice = starMenu(scanner);
        return switch (starChoice) {
            case 1 -> {
                int n = inputRows(scanner);
                starSelectionPreview(patternChoice, starChoice, n);
                rightTriangle(n);
                starPatternCount++;
                yield starPatternCount;
            }
            case 2 -> {
                int n = inputRows(scanner);
                starSelectionPreview(patternChoice, starChoice, n);
                leftTriangle(n);
                starPatternCount++;
                yield starPatternCount;
            }
            case 3 -> {
                int n = inputRows(scanner);
                starSelectionPreview(patternChoice, starChoice, n);
                pyramid(n);
                starPatternCount++;
                yield starPatternCount;
            }
            case 4 -> {
                int n = inputRows(scanner);
                starSelectionPreview(patternChoice, starChoice, n);
                invertedTriangle(n);
                starPatternCount++;
                yield starPatternCount;
            }
            case 5 -> {
                int n = inputRows(scanner);
                starSelectionPreview(patternChoice, starChoice, n);
                diamond(n);
                starPatternCount++;
                yield starPatternCount;
            }
            case 6 -> {
                int n = inputRows(scanner);
                starSelectionPreview(patternChoice, starChoice, n);
                hollowSquare(n);
                starPatternCount++;
                yield starPatternCount;
            }
            case 7 -> {
                int n = inputRows(scanner);
                int cols = inputColumns(scanner);
                starSelectionPreview(patternChoice, starChoice, n, cols);
                hollowRectangle(n, cols);
                starPatternCount++;
                yield starPatternCount;
            }
            case 8 -> {
                int n = inputRows(scanner);
                starSelectionPreview(patternChoice, starChoice, n);
                hollowRightTriangle(n);
                starPatternCount++;
                yield starPatternCount;
            }
            default -> -1;
        };
    }
    static int handleNumberPatterns(Scanner scanner, int patternChoice, int numberPatternCount) {
        int numberChoice = numberMenu(scanner);
        return switch (numberChoice) {
            case 1 -> {
                int n = inputRows(scanner);
                numberSelectionPreview(patternChoice, numberChoice, n);
                numberTriangle(n);
                numberPatternCount++;
                yield numberPatternCount;
            }
            case 2 -> {
                int n = inputRows(scanner);
                numberSelectionPreview(patternChoice, numberChoice, n);
                reverseNumberTriangle(n);
                numberPatternCount++;
                yield numberPatternCount;
            }
            case 3 -> {
                int n = inputRows(scanner);
                numberSelectionPreview(patternChoice, numberChoice, n);
                repeatingNumberTriangle(n);
                numberPatternCount++;
                yield numberPatternCount;
            }
            case 4 -> {
                int n = inputRows(scanner);
                numberSelectionPreview(patternChoice, numberChoice, n);
                floydTriangle(n);
                numberPatternCount++;
                yield numberPatternCount;
            }
            case 5 -> {
                int n = inputRows(scanner);
                numberSelectionPreview(patternChoice, numberChoice, n);
                numberPyramid(n);
                numberPatternCount++;
                yield numberPatternCount;
            }
            case 6 -> {
                int n = inputRows(scanner);
                numberSelectionPreview(patternChoice, numberChoice, n);
                palindromeNumberPyramid(n);
                numberPatternCount++;
                yield numberPatternCount;
            }
            default -> -1;
        };
    }
    static int handleAlphabetPatterns(Scanner scanner, int patternChoice, int alphabetPatternCount) {
        int alphabetChoice = alphabetMenu(scanner);
        return switch (alphabetChoice) {
            case 1 -> {
                int n = inputRows(scanner);
                alphabetSelectionPreview(patternChoice, alphabetChoice, n);
                alphabetTriangle(n);
                alphabetPatternCount++;
                yield alphabetPatternCount;
            }
            case 2 -> {
                int n = inputRows(scanner);
                alphabetSelectionPreview(patternChoice, alphabetChoice, n);
                reverseAlphabetTriangle(n);
                alphabetPatternCount++;
                yield alphabetPatternCount;
            }
            case 3 -> {
                int n = inputRows(scanner);
                alphabetSelectionPreview(patternChoice, alphabetChoice, n);
                repeatingAlphabetTriangle(n);
                alphabetPatternCount++;
                yield alphabetPatternCount;
            }
            case 4 -> {
                int n = inputRows(scanner);
                alphabetSelectionPreview(patternChoice, alphabetChoice, n);
                continuousAlphabetTriangle(n);
                alphabetPatternCount++;
                yield alphabetPatternCount;
            }
            case 5 -> {
                int n = inputRows(scanner);
                alphabetSelectionPreview(patternChoice, alphabetChoice, n);
                alphabetPyramid(n);
                alphabetPatternCount++;
                yield alphabetPatternCount;
            }
            default -> -1;
        };
    }
    static int handleAdvancedPatterns(Scanner scanner, int patternChoice, int advancedPatternCount) {
        int advancedChoice = advancedMenu(scanner);
        return switch (advancedChoice) {
            case 1 -> {
                int n = inputRows(scanner);
                advancedSelectionPreview(patternChoice, advancedChoice, n);
                butterfly(n);
                advancedPatternCount++;
                yield advancedPatternCount;
            }
            case 2 -> {
                int n = inputRows(scanner);
                advancedSelectionPreview(patternChoice, advancedChoice, n);
                concentricNumberSquarePattern(n);
                advancedPatternCount++;
                yield advancedPatternCount;
            }
            case 3 -> {
                int n = inputRows(scanner);
                advancedSelectionPreview(patternChoice, advancedChoice, n);
                consecutiveNumberPyramid(n);
                advancedPatternCount++;
                yield advancedPatternCount;
            }
            case 4 -> {
                int n = inputRows(scanner);
                advancedSelectionPreview(patternChoice, advancedChoice, n);
                ascendingNumberPyramid(n);
                advancedPatternCount++;
                yield advancedPatternCount;
            }
            case 5 -> {
                int n = inputRows(scanner);
                advancedSelectionPreview(patternChoice, advancedChoice, n);
                binaryTrianglePattern(n);
                advancedPatternCount++;
                yield advancedPatternCount;
            }
            default -> -1;
        };
    }
    static String patternCategory(int patternChoice) {
        return switch(patternChoice) {
            case 1 -> "Star Patterns";
            case 2 -> "Number Patterns";
            case 3 -> "Alphabet Patterns";
            case 4 -> "Advanced Patterns";
            default -> "Invalid pattern category choice!";
        };
    }
    static String starPatterns(int starChoice) {
        return switch(starChoice) {
            case 1 -> "Right Triangle";
            case 2 -> "Left Triangle";
            case 3 -> "Pyramid";
            case 4 -> "Inverted Triangle";
            case 5 -> "Diamond";
            case 6 -> "Hollow Square";
            case 7 -> "Hollow Rectangle";
            case 8 -> "Hollow Right Triangle";
            default -> "Invalid star pattern choice!";
        };
    }
    static String numberPatterns(int numberChoice) {
        return switch(numberChoice) {
            case 1 -> "Number Triangle";
            case 2 -> "Reverse Number Triangle";
            case 3 -> "Repeating Number Triangle";
            case 4 -> "Floyd's Triangle";
            case 5 -> "Number Pyramid";
            case 6 -> "Palindrome Number Pyramid";
            default -> "Invalid number pattern choice!";
        };
    }
    static String alphabetPatterns(int alphabetChoice) {
        return switch(alphabetChoice) {
            case 1 -> "Alphabet Triangle";
            case 2 -> "Reverse Alphabet Triangle";
            case 3 -> "Repeating Alphabet Triangle";
            case 4 -> "Continuous Alphabet Triangle";
            case 5 -> "Alphabet Pyramid";
            default -> "Invalid alphabet pattern choice!";
        };
    }
    static String advancedPatterns(int advancedChoice) {
        return switch(advancedChoice) {
            case 1 -> "Butterfly Pattern";
            case 2 -> "Concentric Number Square Pattern";
            case 3 -> "Consecutive Number Pyramid";
            case 4 -> "Ascending Number Pyramid";
            case 5 -> "Binary Triangle Pattern";
            default -> "Invalid advanced pattern choice!";
        };
    }
    static void starSelectionPreview(int patternChoice, int starChoice, int n) {
        System.out.println("\n\n--------SELECTION PREVIEW--------\n");
        System.out.println("Category: " + patternCategory(patternChoice));
        System.out.println("Pattern: " + starPatterns(starChoice));
        System.out.println("Rows: " + n);
        System.out.println("\n---------------------------------\n");
    }
    static void starSelectionPreview(int patternChoice, int starChoice, int n, int cols) {
        System.out.println("\n\n--------SELECTION PREVIEW--------\n");
        System.out.println("Category: " + patternCategory(patternChoice));
        System.out.println("Pattern: " + starPatterns(starChoice));
        System.out.println("Rows: " + n);
        System.out.println("Columns: " + cols);
        System.out.println("\n---------------------------------\n");
    }
    static void numberSelectionPreview(int patternChoice, int numberChoice, int n) {
        System.out.println("\n\n----------SELECTION PREVIEW----------\n");
        System.out.println("Category: " + patternCategory(patternChoice));
        System.out.println("Pattern: " + numberPatterns(numberChoice));
        System.out.println("Rows: " + n);
        System.out.println("\n-------------------------------------\n");
    }
    static void alphabetSelectionPreview(int patternChoice, int alphabetChoice, int n) {
        System.out.println("\n\n-----------SELECTION PREVIEW-----------\n");
        System.out.println("Category: " + patternCategory(patternChoice));
        System.out.println("Pattern: " + alphabetPatterns(alphabetChoice));
        System.out.println("Rows: " + n);
        System.out.println("\n---------------------------------------\n");
    }
    static void advancedSelectionPreview(int patternChoice, int advancedChoice, int n) {
        System.out.println("\n\n-------------SELECTION PREVIEW-------------\n");
        System.out.println("Category: " + patternCategory(patternChoice));
        System.out.println("Pattern: " + advancedPatterns(advancedChoice));
        System.out.println("Rows: " + n);
        System.out.println("\n-------------------------------------------\n");
    }
    static void printReport(int starPatternCount, int numberPatternCount, int alphabetPatternCount, int advancedPatternCount) {
        int totalPatternCount = starPatternCount + numberPatternCount + alphabetPatternCount + advancedPatternCount;
        System.out.println("\n\n-------------------------------------");
        System.out.println("PROJECT REPORT");
        System.out.println("-------------------------------------\n");
        System.out.println("Total Patterns Printed: " + totalPatternCount);
        System.out.println("\nStar Patterns: " + starPatternCount);
        System.out.println("Number Patterns: " + numberPatternCount);
        System.out.println("Alphabet Patterns: " + alphabetPatternCount);
        System.out.println("Advanced Patterns: " + advancedPatternCount);
        System.out.println("\nThank You For Using\nPattern Printing System!");
        System.out.println("-------------------------------------");
    }
    static int inputRows(Scanner scanner) {
        int n;
        do {
            System.out.print("\nEnter number of rows: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Invalid number of rows! Rows must be greater than 0.");
            }
        } while (n <= 0);
        return n;
    }
    static int inputColumns(Scanner scanner) {
        int cols;
        do {
            System.out.print("\nEnter number of columns: ");
            cols = scanner.nextInt();
            if (cols <= 0) {
                System.out.println("Invalid number of columns! Columns must be greater than 0.");
            }
        } while (cols <= 0);
        return cols;
    }
    static void rightTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void leftTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void invertedTriangle(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void diamond(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void hollowSquare(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void hollowRectangle(int n, int cols) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=cols; j++) {
                if (i==1 || i==n || j==1 || j==cols) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void hollowRightTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if (i==n || j==1 || i==j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void numberTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void reverseNumberTriangle(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void repeatingNumberTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void floydTriangle(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    static void numberPyramid(int n) {
        for(int i=1; i<=n; i++) {
            int num = 1;
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print(num);
                if (j <= (2*i-1)/2) {
                    num++;
                }
                else {
                    num--;
                }
            }
            System.out.println();
        }
    }
    static void palindromeNumberPyramid(int n) {
        for(int i=1; i<=n; i++) {
            int num = i;
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print(num);
                if (j <= (2*i-1)/2) {
                    num--;
                }
                else {
                    num++;
                }
            }
            System.out.println();
        }
    }
    static void alphabetTriangle(int n) {
        for(int i=1; i<=n; i++) {
            char ch = 'A';
            for(int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    static void reverseAlphabetTriangle(int n) {
        for(int i=n; i>=1; i--) {
            char ch = 'A';
            for(int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    static void repeatingAlphabetTriangle(int n) {
        char ch = 'A';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
    static void continuousAlphabetTriangle(int n) {
        char ch = 'A';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    static void alphabetPyramid(int n) {
        for(int i=1; i<=n; i++) {
            char ch = 'A';
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print(ch);
                if (j <= (2*i-1)/2) {
                    ch++;
                }
                else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
    static void butterfly(int n) {
        for(int i=1; i<=2*n-1; i++) {
            int stars, spaces;
            if (i > n) {
                stars = 2*n-i;
                spaces = 2*(i-n);
            }
            else {
                stars = i;
                spaces = 2*(n-i);
            }
            for(int j=1; j<=stars; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void concentricNumberSquarePattern(int n) {
        for(int i=0; i<2*n-1; i++) {
            for(int j=0; j<2*n-1; j++) {
                System.out.print(n-(Math.min(Math.min(j,2*n-2-j),Math.min(i,2*n-2-i))) + " ");
            }
            System.out.println();
        }
    }
    static void consecutiveNumberPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=i; j<=2*i-1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void ascendingNumberPyramid(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void binaryTrianglePattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if (j % 2 == 0) {
                    System.out.print(0);
                }
                else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}