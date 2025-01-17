import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ArrayList<Itemshop> items = new ArrayList<>();
            items.add(new ItemFood("fd001", "Noodle(30-pack)", "FOOD", 5.00, 5000));
            items.add(new ItemFood("fd002", "Meat(Kg)", "FOOD", 6.00, 400));
            items.add(new ItemFood("fd003", "Bread(loaf)", "FOOD", 0.83, 1000));
            items.add(new ItemFood("fd004", "Eggs(dozen)", "FOOD", 4.5, 10000));
            items.add(new ItemFood("fd005", "Coca-Cola(six-pack)", "FOOD", 4.0, 2500));
    
            items.add(new ItemConsumer("cs001", "Soap(12-pack)", "CONSUMER", 5.50, 3000));
            items.add(new ItemConsumer("cs002", "Laptop", "CONSUMER", 1250.75, 89));
            items.add(new ItemConsumer("cs003", "Socker(12-pack)", "CONSUMER", 8.0, 1250));
            items.add(new ItemConsumer("cs004", "Fan(1)", "CONSUMER", 30.99, 500));
            items.add(new ItemConsumer("cs005", "Locker(1)", "CONSUMER", 59.99, 750));
        
        ArrayList<Detail> detail = new ArrayList<>();
        detail.add(new Detail(null,null,1,1.0,items));
        
        
	    System.out.println("\t\tWelcome to our Shop!!!");
        System.out.println("Hello! Customer, Would you like to order our product?");
        System.out.print("Yes/No?: ");
        String conshop = sc.nextLine();
        
        String name;
        String local;
        String no;
        if(conshop.equals("Yes") || conshop.equals("yes") || conshop.equals("Y") || conshop.equals("y")){
            System.out.print("Please Enter your name: ");
            name = sc.nextLine();
            System.out.print("Please Enter your Local: ");
            local = sc.nextLine();
            System.out.print("Please Enter your Phone No: ");
            no = sc.nextLine();
            
            ArrayList<Dealer> dealer = new ArrayList<Dealer>();
            dealer.add(new Dealer(name,local,no));
            
            displayDealer(dealer);
            
            ArrayList<Order> order = new ArrayList<>();
            char check;
            String codeP;
            int number_product;
            double sumorder=0.0;
            double sum=0.0;
            ArrayList<Purchase> pur = new ArrayList<>();
        
            do{
                displayOrder(items);
                    
                    System.out.println("Press the Enter button to continue.");
                    sc.nextLine();
                    System.out.print("Enter code of the product: ");
                    codeP = sc.nextLine();
                    //
                    
                    for(Itemshop itemcheck : items){
                        if(codeP.equals(itemcheck.getProductcode())){
                            System.out.println("How many product do you want?");
                            System.out.print("Enter the number of product: ");
                            number_product = sc.nextInt();
                            //
                            order.add(new Order(codeP,number_product));
                            
                            itemcheck.setNumofproduct(number_product);
                            sumorder += calProduct(number_product,codeP,items);
                            sum = calProduct(number_product,codeP,items);
                            //
                            //
                            pur.add(new Purchase(codeP,itemcheck.getName(),sum,number_product));
                            System.out.println();
                            System.out.println("You select buy "+ itemcheck.getName() +" and number of product is "+number_product);
                            System.out.println("Total Cost: "+sum + " $");
                            System.out.println("-------------------------------");
                        }
                    }
                
                System.out.print("Do you want to continue shopping [y/n]: ");
                check = sc.next().charAt(0);
            }while(check == 'Y' || check == 'y');
            
            System.out.println();
            System.out.println("----------------------------------------------------");
            
           int j=1;
            for(Purchase purs : pur){
                System.out.print(j+". "+purs.toString());
                System.out.println();
                System.out.println("----------------------------------------------------");
                j++;
            }
            System.out.println("Total Cost the Order : "+sumorder+ " $");
            
            char checkpurchase;
            System.out.print("Do you want to proceed with the purchase [y/n]: ");
            checkpurchase = sc.next().charAt(0);
            
            if (checkpurchase == 'y' || checkpurchase == 'Y') {
                System.out.println(items.get(0).getDate());
                System.out.println("You can Scan QR Code or pay by cash at the counter!");
                System.out.println("Thank you!!!");
            }else {
                System.out.println("You have canceled the purchase");
                System.out.println("Thank you!!!");
            }
            
        }else {
            System.out.println("Thank you!!! You can come back whenever you want.");
        }
	}
	
	private static void displayDealer(ArrayList<Dealer> deal){
	    System.out.println("=====================================================================");
        System.out.println("This is your information:");
    	    for(Dealer deals : deal){
    	        System.out.println(deals.toString());
    	    }
    	System.out.println("=====================================================================");
    	System.out.println();
	}
	
	private static void displayOrder(ArrayList<Itemshop> item){
	    System.out.println("\n\n*****************************Order*******************************");
        System.out.println("\t\t\t      FOOD");
        int index1 = 1;
	    for(Itemshop items : item){
	        if(items instanceof ItemFood){
	            System.out.print(index1 + ". "+items.toString());
	            System.out.println();
	            index1++;
	        }
	    }
	    
	    System.out.println("-----------------------------------------------------------------");
        System.out.println("\t\t\t    CONSUMER");
        int index2 = 1;
        for(Itemshop items : item){
	        if(items instanceof ItemConsumer){
	            System.out.print(index2 + ". "+items.toString());
	            System.out.println();
	            index2++;
	        }
	    }
	    System.out.println("\n\n*****************************************************************");
	}
	
	private static double calProduct(int num,String code,ArrayList<Itemshop> item){
	    double sum=0.0;
	    for(Itemshop items : item){
	        if(code.equals(items.getProductcode())){
	            sum += items.getCost() * num;
	        }
	    }
	    return sum;
	}
}
