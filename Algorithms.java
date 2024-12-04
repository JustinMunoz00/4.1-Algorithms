import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigits = twoDigit();
        int greaterThan500 = greaterThan500();
        int greatest = greatest();
        int least = least();
        int sum = sum();
        double average = average();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twoDigits);
        System.out.println(greaterThan500);
        System.out.println(greatest);
        System.out.println(least);
        System.out.println(sum);
        System.out.println(average);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int twoDigit() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigits = 0;
        int x = 0;
        while (s.hasNext()) {
            x = s.nextInt();
            if (x < 100 & x > 9)
                twoDigits++;
        }
        return twoDigits;
    }

    public static int greaterThan500() throws FileNotFoundException{
        s = new Scanner(f);
        int greaterThan500 = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
                greaterThan500++;
        }
        return greaterThan500;
    }

    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest = Integer.MIN_VALUE;
        int x;
        while (s.hasNext()) {
            x = s.nextInt();
            if (x > greatest)
                greatest = x;
        }
        return greatest;
    }

    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = Integer.MAX_VALUE;
        int x;
        while (s.hasNext()) {
            x = s.nextInt();
            if (x < least)
                least = x;
        }
        return least;
    }

    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
            sum += s.nextInt();
        }
        return sum;
    }

    public static double average() throws FileNotFoundException{
        s = new Scanner(f);
        int total = 0;
        while (s.hasNext()) {
            s.nextInt();
            total++;
        }
        return (int)((sum()*1000.0/total))/1000.0;
    }

    public static int mode() throws FileNotFoundException{
        return 0;
    }
}