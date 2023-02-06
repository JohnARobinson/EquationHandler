import java.util.Scanner;
import java.util.Scanner;
import java.lang.String;
import java.awt.*;

public class MathHandler{

    public static String equation;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Equation: ");
        equation = myObj.nextLine();
        System.out.println(equation);
        
    }

    public String parenthesesCruncher(String equation)
    {
        char[] c = stringToCharArray(equation);
        int left_Parentheses_Location = 0;
        int right_Parentheses_Location = 0;

        //find left most ( parentheses
        for(int i = 0; i < c.length; i++)
        {
            if(c[i] == '(');
            {
                left_Parentheses_Location = i;
            }

        }
        for(int i = left_Parentheses_Location; i < c.length; i++)
        {
            if(c[i] == ')');
            {
                right_Parentheses_Location = i;
                break;
            }

        }
        


        return equation;

    }








    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int symbolCounter(char[] equation)
    {
        int total=0;

        for(int i = 0; i < equation.length; i++)
        {
            if(equation[i] == '*' || equation[i] == '/' || equation[i] == '+' || equation[i] == '-' || equation[i] == '^')
            {
                total++;
            }
        }
        return total;
    }

    public char[] stringToCharArray(String s)
    {
        char[] c = new char[s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            c[i] = s.charAt(i);
            //System.out.println(c[i]);    
        }
        return c;
    }

    public String charArrayToString(char[] c)
    {
        String s = "";
        for(int i = 0; i < c.length; i++)
        {
            s = s + c[i];
            //System.out.println(c[i]);    
        }
        return s;
    }


    public double mathHandler(double left, double right, char symbol)
    {
        double total = 0;
        if(symbol == '+')
        {
            total = left + right;
        }
        if(symbol == '-')
        {
            total = left - right;
        }
        if(symbol == '*')
        {
            total = left * right;
        }
        if(symbol == '/')
        {
            total = left / right;
        }
        if(symbol == '^')
        {
            total = Math.pow(left, right);
        }
        return total;
    }



}