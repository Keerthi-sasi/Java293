class Day6
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("learn");
        System.out.println(sb);
        sb.append(" java");
        System.out.println(sb);
        sb.insert(5,"ing");
        System.out.println(sb);
        sb.replace(9,13,"python");
        System.out.println(sb);
        sb.delete(0, 9);
        System.out.println(sb);
        sb.append("n");
        sb.deleteCharAt(6);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(4));
        System.out.println(sb.substring(2));
        sb.ensureCapacity(10);
        System.out.println(sb);
        sb.setCharAt(4,'n');
        System.out.println(sb); 
        System.out.println(sb.indexOf("n"));
        System.out.println(sb.lastIndexOf("n"));
        sb.setLength(35);
        System.out.println(sb.length());
        System.out.println(sb.toString());
        StringBuilder str = new StringBuilder("Java");
        System.out.println(str);
    }
}