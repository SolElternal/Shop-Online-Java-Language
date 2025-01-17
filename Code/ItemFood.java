import java.util.Date;

public class ItemFood extends Itemshop {
	private String type;
	
	public ItemFood(String pc,String name,String type,double cost,int num){
        super(pc,name,cost,num);
        this.type = type;
    }
	public String getType(){
        return this.type;
    }
	
	public String toString() {
		return "code: "+getProductcode()+" | "+getName()+" | cost: "+getCost()+"$ | available: "+getNumofproduct();
	}
	
}