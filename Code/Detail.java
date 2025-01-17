import java.util.ArrayList;
class Detail{
    private String product_code_detail;
    private String product_code;
    private int numofproduct;
    private double cost;
    private ArrayList<Itemshop> itemshop;
    
    public Detail(String code_detail,String code_product,int num,double cost,ArrayList<Itemshop> item){
        this.product_code_detail = code_detail;
        this.product_code = code_product;
        this.numofproduct = num;
        this.cost = cost;
        this.itemshop = item;
    }
    
    public ArrayList<Itemshop> getItemshopdetail(){
        return this.itemshop;
    }
    
    public void setItemshop(ArrayList<Itemshop> item){
        this.itemshop = item;
    }
    
    public String getProductCodeDetail(){
        return this.product_code_detail;
    }
    
    public String getProductCode(){
        return this.product_code;
    }
    
    public int getNumofProduct(){
        return this.numofproduct;
    }
    
    public double getCost(){
        return this.cost;
    }
}