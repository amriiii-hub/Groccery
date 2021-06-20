/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author DELL
 */
public class Amount
{
public static void tableWithLines() {
	/*
	 * leftJustifiedRows - If true, it will add "-" as a flag to format string to
	 * make it left justified. Otherwise right justified.
	 */
	boolean leftJustifiedRows = true;
        
	/*
	 * Table to print in console in 2-dimensional array. Each sub-array is a row.
	 */
	String[][] table = new String[][] { { "S.no", "Vegetable Name", "Kg", "Price" },
			{ "1", "Potato", "1", "45" }, { "2", "Carrot", "1/2", "15" },{ "3", "Beetroot", "1" , "50" }, { "4", "Beans", "1/2", "22" },
			{ "5", "Cauli Flower", "1", "75" } };
 
	/*
	 * Calculate appropriate Length of each column by looking at width of data in
	 * each column.
	 * 
	 * Map columnLengths is <column_number, column_length>
	 */
	Map<Integer, Integer> columnLengths = new HashMap<>();
	Arrays.stream(table).forEach(a -> Stream.iterate(0, (i -> i < a.length), (i -> ++i)).forEach(i -> {
		if (columnLengths.get(i) == null) {
			columnLengths.put(i, 0);
		}
		if (columnLengths.get(i) < a[i].length()) {
			columnLengths.put(i, a[i].length());
		}
	}));
	
 
	/*
	 * Prepare format String
	 */
	final StringBuilder formatString = new StringBuilder("");
	String flag = leftJustifiedRows ? "-" : "";
	columnLengths.entrySet().stream().forEach(e -> formatString.append("| %" + flag + e.getValue() + "s "));
	formatString.append("|\n");
	
 
	/*
	 * Prepare line for top, bottom & below header row.
	 */
	String line = columnLengths.entrySet().stream().reduce("", (ln, b) -> {
		String templn = "+-";
		templn = templn + Stream.iterate(0, (i -> i < b.getValue()), (i -> ++i)).reduce("", (ln1, b1) -> ln1 + "-",
				(a1, b1) -> a1 + b1);
		templn = templn + "-";
		return ln + templn;
	}, (a, b) -> a + b);
	line = line + "+\n";
	
 
	/*
	 * Print table
	 */
	System.out.print(line);
	Arrays.stream(table).limit(1).forEach(a -> System.out.printf(formatString.toString(), a));
	System.out.print(line);
 
	Stream.iterate(1, (i -> i < table.length), (i -> ++i))
			.forEach(a -> System.out.printf(formatString.toString(), table[a]));
	System.out.print(line);
}
public void Instrested()
{
    Scanner se=new Scanner(System.in);
    System.out.println("Are you willing to buy any of these Vegetables? Press 1 to buy: ");
        int num,choice;
        choice=se.nextInt();
        if (choice==1)
        {
            Availability a=new Availability();
            a.available();
        }
}
}