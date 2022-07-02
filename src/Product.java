public class Product {
    
    public Product(int id, String name, String description, double price,  int stockAmount){
        System.out.println("Yapıcı çalıştı.");
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
    }

    public Product(){
        
    }


    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
         this.name=name;
    }

    public String getdescription(){
        return description;
    }
    public void setdescription(String description){
        this.description=description;
    }

    public double getprice(){
        return price;
    }
    public void setprice(double price){
        this.price=price;
    }

    public int getstockAmount(){
        return stockAmount;
    }
    public void setstockAmount(int stockAmount){
        this.stockAmount=stockAmount;
    }

    public String getkod(){
        return this.name.substring(0,1)+id;
    }

}
