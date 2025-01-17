class Dealer{
    private String codeOfDealer = "00001";
    private String name;
    private String local;
    private String number;
    
    public Dealer(String name,String local,String number){
        this.name = name;
        this.local = local;
        this.number = number;
    }
    
    public String getCodeDealer(){
        return this.codeOfDealer;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLocal(){
        return this.local;
    }
    
    public String getNumber(){
        return this.number;
    }
    
    public String toString(){
        return "Code customer: "+getCodeDealer()+"\nName : "+getName()+ "\nLocation : "+getLocal()+ "\nPhone-Number : "+getNumber();
    }
}