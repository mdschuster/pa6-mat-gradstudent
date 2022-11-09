package edu.wit.cs.comp5900;

import java.io.PrintWriter;
import java.util.Scanner;

//TODO: document this class
public class PA6c {
	
	/**
	 * Error to output if can't open any files
	 */
	public static final String ERR_FILE = "Error opening file(s)";
	
	/**
	 * Error to output if files open but matrices
	 * are of incompatible dimensions for multiplication
	 */
	public static final String ERR_DIMS = "Bad matrix dimensions";
	
	private static void _outputMatrix(PrintWriter out, int[][] m, boolean includeDimensions) {		
		for (int r=0; r<m.length; r++) {
			if (includeDimensions && r==0) {
				out.printf("%d%n%d%n", m.length, m[0].length);
			}
			for (int c=0; c<m[r].length; c++) {
				out.printf("%d", m[r][c]);
				out.printf((c<m[r].length-1)?" ":"%n");
			}
		}
	}
	
	/**
	 * Prints a matrix to the terminal
	 * without dimensions
	 * 
	 * @param m matrix to print
	 */
	public static void printMatrix(int[][] m) {
		_outputMatrix(new PrintWriter(System.out, true), m, false);
	}
	
	/**
	 * Prints a matrix to a file
	 * with associated dimensions
	 * 
	 * @param m matrix to print
	 * @param pw open file
	 */
	public static void printMatrix(int[][] m, PrintWriter pw) {
		_outputMatrix(pw, m, true);
	}
	
	/**
	 * Checks if two matrices can be multiplied
	 * (i.e. the columns of the first match
	 * the rows of the second)
	 * 
	 * @param m1 matrix 1
	 * @param m2 matrix 2
	 * @return true if m1 x m2 is legal
	 */
	public static boolean canMultiply(int[][] m1, int[][] m2) {
		return false;
	}
	
	/**
	 * Reads and returns a matrix from a scanner
	 * Format:
	 * m (# rows)
	 * n (# #cols)
	 * r0c0 r0c1 ... r0cn (values in row 0, column-by-column)
	 * r1c0 r1c1 ... r1cn (values in row 1, column-by-column)
	 * ...
	 * rmc0 rmc1 ... rmcn (values in last row, column-by-column)
	 * 
	 * Results in...
	 * int[][] {
	 * 	{r0c0, r0c1, ... r0cn},
	 *  {r1c0, r1c1, ... r1cn},
	 *  ...
	 *  {rmc0, rmc1, ... rmcn}
	 * }
	 * 
	 * @param s input source
	 * @return resulting matrix
	 */
	public static int[][] readMatrix(Scanner s) {
		return null;
	}
	
	/**
	 * Multiply two matrices and
	 * return the result
	 * 
	 * @param m1 matrix 1
	 * @param m2 matrix 2
	 * @return result of m1 x m2
	 */
	public static int[][] matrixMultiply(int[][] m1, int[][] m2) {		
		return null;
	}
	
	/**
	 * Program to multiply matrices:
	 * 1. Ask for paths for 3 files (2 input, 1 output)
	 * 2. Check if inputs can be multiplied
	 * 3. If so, multiply!
	 *    - Output the full problem to the console
	 *    - Output only the result matrix to the file
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		// Hint: paths should be read as an entire line!
	}

}
