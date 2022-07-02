public class Atrribute {
    public static void main(String[] args) throws Exception {
        
        Product product = new Product(1, "Laptop", "Asus", 20000, 20);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getkod()); 
        
    }
}
