import java.util.Date;
import java.util.ArrayList;

class Order {
    private String codeOrder;
    private Date date;
    private int numofproduct;
    private double sumofproduct;
    private final ArrayList<Detail> details;

    public Order(String codeorder, int num) {
        this.codeOrder = codeorder;
        this.numofproduct = num;
        this.date = new Date();
        this.details = new ArrayList<>(); 
    }

    public double getSumofproduct() {
        double sum = 0;
        if (details != null) {
            for (Detail detail : details) {
                sum += detail.getCost() * detail.getNumofProduct();
            }
        }
        return sum;
    }

    public String getcodeOrder() {
        return this.codeOrder;
    }

    public Date getDate() {
        return this.date;
    }



    public int getNumofproduct() {
        return this.numofproduct;
    }

    public ArrayList<Detail> getDetails() {
        return this.details;
    }
}