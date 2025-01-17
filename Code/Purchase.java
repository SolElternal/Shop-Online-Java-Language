import java.util.ArrayList;
class Purchase{
    private String numofpurchase;
    private String codepurchase;
    private String name;
    private double cost;
    private String codeproduct;
    private int numberproduct;
    private ArrayList<Order> order = new ArrayList<>(); // Initialize this in the constructor
    
    public Purchase(String code,String name,double cost,int num){
        this.numofpurchase = "#001"; 
        this.codepurchase = "00001001";
        this.codeproduct = code;
        this.name = name;
        this.cost = cost;
        this.numberproduct = num;
    }
    
    public String getNumofpurchase(){
        return this.numofpurchase;
    }
    
    public String getcodepurchase(){
        return this.codepurchase;
    }
    
    public ArrayList<Order> getOrder(){
        return this.order;
    }
    
    public String toString(){
        return "Code : "+ this.codeproduct + "\n Name product : "+this.name + "\n Number of product : "+ this.numberproduct + "\nTotal Cost: "+this.cost;
    }
}