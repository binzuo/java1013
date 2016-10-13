package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class Season {
    private final String name;
    private final String characteristic ;

    private Season(String name, String characteristic) {
        this.name=name;
        this.characteristic=characteristic;
    }
    public String getName(){
        return this.name;
    }
    public String getCharacteristic(){
        return this.characteristic;
    }

    public static final Season Spring=new Season("春天","小桥流水");
    public static final Season Summer=new Season("夏天","烈日高照");
    public static final Season Fall=new Season("秋天","天高云淡");
    public static final Season Winter=new Season("冬天","白雪皑皑");

    public static void main(String[] args) {
        System.out.println(Spring.getName());
        System.out.println(Spring.getCharacteristic());
    }


}
