public class Teacher
 {
   int numberOne, numberTwo;
  String operator = "";
  boolean right;
   public int giveNumberOne(int n)
  {
      numberOne = (int)(Math.random() * n) + 1;
       return numberOne;
    }
   public int giveNumberTwo(int n)
  {
   numberTwo = (int)(Math.random() * n) + 1;
   return numberTwo;
  }
   public String giveOperator()
  {   double d = Math.random();
   if (d >= 0.5)
    operator = "+";
   else
    operator = "-";
   return operator;
  }
   public boolean getRight(int answer)
  { 
  if (operator.equals("+"))
    {
    if (answer == numberOne + numberTwo)
     right = true;
    else
     right = false;
   }
    else if (operator.equals("-"))
   { 
    if (answer == numberOne - numberTwo)
     right = true;
    else
     right = false;
   }
    return right;
   }
  }