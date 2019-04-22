package ChapterFourteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-22 10:18
 **/


class Goods{
    private String goodsId;
    private String shopId;
    private String goodsPrice;


    public Goods(String goodsId, String shopId, String goodsPrice) {
        this.goodsId = goodsId;
        this.shopId = shopId;
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
public class Test {


    public static void main(String[] args) {
        Map<String, List<Goods>> map = new HashMap<>();
        Goods goods = new Goods("1", "2", "3");
        Goods goods1 = new Goods("1", "2", "3");
        Goods goods2= new Goods("1", "2", "3");
        List<Goods> list = new ArrayList<>();
        list.add(goods1);
        list.add(goods2);
        list.add(goods);
        map.put("param",list);
        System.out.println(list);
        System.out.println(map);
    }
}
