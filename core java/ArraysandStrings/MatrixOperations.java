package ArraysandStrings;


	import java.util.Scanner;

	public class MatrixOperations {

	    // Method for matrix addition
	    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows = matrix1.length;
	        int cols = matrix1[0].length;
	        int[][] result = new int[rows][cols];
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }
	        return result;
	    }

	    // Method for matrix subtraction
	    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows = matrix1.length;
	        int cols = matrix1[0].length;
	        int[][] result = new int[rows][cols];
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = matrix1[i][j] - matrix2[i][j];
	            }
	        }
	        return result;
	    }

	    // Method to print a matrix
	    public static void printMatrix(int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the dimensions of the matrices
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = scanner.nextInt();

	        // Initialize the matrices
	        int[][] matrix1 = new int[rows][cols];
	        int[][] matrix2 = new int[rows][cols];

	        // Input matrix 1
	        System.out.println("Enter elements of Matrix 1:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }

	        // Input matrix 2
	        System.out.println("Enter elements of Matrix 2:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }

	        // Perform matrix addition
	        int[][] additionResult = addMatrices(matrix1, matrix2);
	        System.out.println("\nMatrix Addition Result:");
	        printMatrix(additionResult);

	        // Perform matrix subtraction
	        int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
	        System.out.println("\nMatrix Subtraction Result:");
	        printMatrix(subtractionResult);

	        scanner.close();
	    }
	}

