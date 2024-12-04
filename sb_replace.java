//replace(int start, int end, String str) - Replaces characters from start to end with the specified string.
class sb_replace{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello Tanuja");
        sb.replace(6,12,"World");
        System.out.println("After replace: "+sb);
    }
}
