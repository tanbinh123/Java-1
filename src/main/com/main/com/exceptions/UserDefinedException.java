package main.com.exceptions;
import java.util.*;

public class UserDefinedException{
    public static void main(String[] args) throws InvalidMonthException {
        Scanner sc = new Scanner(System.in);

        String[] months = {"Janaury", "February", "March", "April", "May"};
        System.out.println("Please enter a month");
        String month = sc.next();

        try {
            for (String m : months) {
                if (m.equals(month)) {
                    System.out.println("Month is present in Array");
                }

                throw new InvalidMonthException("Hey, No month like this");
            }
        } catch (InvalidMonthException e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }

        return;
    }
}
