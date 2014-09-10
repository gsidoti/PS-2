package MainPackage;

public class MyInteger {

    private int value;

    public MyInteger(int value)
    {
        this.value = value;
    }

    public int GetValue()
    {
        return this.value;

    }

    public boolean IsEven()
    {
        return value % 2 == 0;

    }

    public boolean IsOdd()
    {
        return value % 2 != 0;
    }

    public boolean IsPrime() 
    {
        if (value % 2 == 0)
            return false;
        for (int i = 3; i * i <= value; i += 2)
        {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean IsEven(int value)
    {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean IsOdd(int value)
    {
        if (value % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean IsPrime(int value)
    {
        if (value % 2 == 0)
            return false;
        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    private static boolean IsEven(MyInteger MyInt)
    {
        return (MyInt.value % 2 == 0);
    }

    private static boolean IsOdd(MyInteger MyInt)
    {
        return (MyInt.value % 2 != 0);
    }

    private static boolean IsPrime(MyInteger MyInt)
    {
        return MyInt.IsPrime(MyInt.GetValue());
    }

    public boolean equals(int Number)
    {
        if (Number == value) {
            return true;
        } else {
            return false;
        }
    }

    private boolean equals(MyInteger Number)
    {
        if (Number.value == value) {
            return true;
        } else {
            return false;
        }
    }

    public static int parseInt(char[] x)
    {
        int total = 0;

        for (int i = 0; i < x.length; i++) {
            total = x[i];
            total++;
        }

        return total;
    }

    public static int parseInt(String word)
    {
        return word.length();
    }

}