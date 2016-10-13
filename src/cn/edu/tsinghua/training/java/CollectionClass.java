package cn.edu.tsinghua.training.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class CollectionClass {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add("南无地藏菩萨摩诃萨！");
        collection.add(1);
        System.out.println("集合collection的元素个数："+collection.size());
        collection.remove(1);
        System.out.println("集合collection的元素个数："+collection.size());
        System.out.println("集合collection是否包含 南无地藏菩萨摩诃萨！字符 ："+collection.contains("南无地藏菩萨摩诃萨！"));
        collection.add("南无阿弥陀佛！");
        System.out.println("集合collection的元素："+collection);
        Collection collection1=new HashSet();
        collection1.add("南无阿弥陀佛！");
        collection1.add("南无本师释迦牟尼佛");
        System.out.println("集合collection1的元素："+collection1);
        System.out.println("集合collection是否包含collection1集合："+collection1.contains(collection));
        collection.removeAll(collection1);
        System.out.println("集合collection的元素："+collection);//[南无地藏菩萨摩诃萨！]
        collection.clear();
        System.out.println("集合collection的元素:"+collection);//[]
        //collection1.
        //collection1.retainAll(collection);
        //System.out.println("集合collection1的元素："+collection1);






    }
}
