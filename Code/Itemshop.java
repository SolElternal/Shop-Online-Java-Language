import java.util.Date;
class Itemshop{
    private String productcode;
    private String name;
    //private String type;
    private double cost;
    private int numofproduct_pull;
    private Date date;
    
    public Itemshop(String pc,String name,double cost,int num){
        this.productcode = pc;
        this.name = name;
        //this.type = type;
        this.cost = cost;
        this.numofproduct_pull = num;
        
        //set times to buy product
        this.date = new Date();
    }
    
    public String getProductcode(){
        return this.productcode;
    }
    
    public String getName(){
        return this.name;
    }
    
   /* public String getType(){
        return this.type;
    }*/
    
    public double getCost(){
        return this.cost;
    }
    
    public int getNumofproduct(){
        return this.numofproduct_pull;
    }
    
    public int setNumofproduct(int n) {
        this.numofproduct_pull -= n; // Update the value
        return this.numofproduct_pull;
    }
    
    public Date getDate(){
        return this.date;
    }
    
    
}