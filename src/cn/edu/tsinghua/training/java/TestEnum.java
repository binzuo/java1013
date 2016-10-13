package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class TestEnum {
    public void judge(SeasonEnum s){
        switch (s){
            case SPRING:
                System.out.println("万物复苏的春天");
                break;
            case SUMMER:
                System.out.println("盛夏的果实");
                break;
            case FALL:
                System.out.println("天高云淡之秋");
                break;
            case WINTER:
                System.out.println("白雪皑皑之冬");
                break;
        }

    }

    public static void main(String[] args) {
        for (SeasonEnum s:SeasonEnum.values()) {
            System.out.println(s);
        }
        TestEnum testEnum=new TestEnum();
        testEnum.judge(SeasonEnum.SPRING);
    }

}
