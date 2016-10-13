package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public enum Color {
    RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int rv, int gv, int bv) {
        this.redValue = rv;
        this.greenValue = gv;
        this.blueValue = bv;
    }
    //public String valueOf(){
    //    return super.toString();
    //}


    public static void main(String[] args) {
        Color C=Color.RED;
        System.out.println(Color.valueOf("RED"));

    }

}
