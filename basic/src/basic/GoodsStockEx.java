package basic;

import java.util.ArrayList;

public class GoodsStockEx {

	public static void main(String[] args) {
		ArrayList<GoodsStock> goods = new ArrayList<GoodsStock>();
		goods.add(new GoodsStock("s1505",10));
		goods.add(new GoodsStock("s1506",10));
		goods.add(new GoodsStock("s1507",10));
		goods.add(new GoodsStock("s1508",10));
		goods.add(new GoodsStock("s1509",10));
		
		
		goods.get(0).addgoodsNo(5);
		goods.get(1).addgoodsNo(4);
		goods.get(2).addgoodsNo(3);
		goods.get(3).addgoodsNo(2);
		goods.get(4).addgoodsNo(7);
		for(GoodsStock e:goods) {
			System.out.println(e.getGoodsCode()+" "+e.getGoodsNo());
		}
		System.out.println();
		goods.get(0).downgoodsNo(2);
		goods.get(1).downgoodsNo(1);
		goods.get(2).downgoodsNo(2);
		goods.get(3).downgoodsNo(1);
		goods.get(4).downgoodsNo(5);
		for(GoodsStock e:goods) {
			System.out.println(e.getGoodsCode()+" "+e.getGoodsNo());
		}
	}

}
