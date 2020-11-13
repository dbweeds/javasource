package basic;

public class GoodsStock {
	private String goodsCode;
	private int goodsNo;
	
	
	public GoodsStock(String goodsCode, int goodsNo) {
		super();
		this.goodsCode = goodsCode;
		this.goodsNo = goodsNo;
	}
	public void addgoodsNo(int no) {
		goodsNo += no;
	}
	public void downgoodsNo(int no) {
		goodsNo -= no;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public int getGoodsNo() {
		return goodsNo;
	}
	public void setGoodsNo(int goodsNo) {
		this.goodsNo = goodsNo;
	}
}
