
public class szEntity {
//識別子、靴のID、サイズ（３２～４２）、在庫数
	private int id;
	private int shoeId;
	private int size;
	private int amount;
	
//	各カラムのget/set
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public int getShoeId() {return shoeId;}
	public void setShoeId(int shoeId) {this.shoeId = shoeId;}
	
	public int getSize() {return size;}
	public void setSize(int size) {this.size = size;}
	
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}
}
