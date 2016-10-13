package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class TestColor {
    public static void main(String[] args) {
        //Color color=new Color(100,200,300);
        //Color color=Color.RED;

        System.out.println(Color.RED.toString());
        System.out.println(Color.BLACK.ordinal());//2
        System.out.println(Color.GREEN.ordinal());//4
        System.out.println(Color.BLACK.compareTo(Color.GREEN));
        System.out.println(Color.valueOf("RED"));
        for (Color c:Color.values()){
            System.out.println(c+",");
        }
        //Color.valueOf("YELLOE");
        System.out.println(Color.valueOf("YELLOW"));
        //System.out.println(Color.valueOf("YELLOE"));

    }


}
