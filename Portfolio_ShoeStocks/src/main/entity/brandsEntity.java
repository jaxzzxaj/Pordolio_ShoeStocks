
public class brandsEntity {
//	靴の名前用のID,ブランド名、靴の種類、色、値段、サイズのID
	private int brID;
	private String brandName;
	private String shoeType;
	private String color;
	private int price;
	private int szID;
	
//	各カラムのget/set
	public int getBrID() {return brID;}
	public void setBrID(int brID) {this.brID = brID;}
	
	public String getBrandName() {return brandName;}
	public void setBrandName(String brandName) {this.brandName = brandName;}
	
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	
	public String getShoeType() {return shoeType;}
	public void setShoeType(String shoeType) {this.shoeType = shoeType;}
	
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	
	public int getSzID() {return szID;}
	public void setSzID(int szID) {this.szID = szID;}
	
}
