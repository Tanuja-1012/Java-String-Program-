//equals(Object another) and equalsIgnoreCase(String another)
//Compares two strings for equality. The equalsIgnoreCase method ignores case.
class str_equals{
    public static void main(String args[]){
     String str="Tanuja";
     System.out.println("Check is the String is equal:"+str.equals("tanuja"));
     boolean ignore =str.equalsIgnoreCase("tanuja");
     System.out.println("Ignore case:"+ignore);
    }
}

