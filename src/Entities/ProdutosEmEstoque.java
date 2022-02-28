package Entities;

public class ProdutosEmEstoque {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(double price, int quantity) {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
            return  name
                    + ", $ "
                    + String.format("%.2f", price)
                    + " , "
                    + quantity
                    + " units, Total: $ "
                    + String.format("%.2f", totalValueInStock(this.price, this.quantity));
    }
}
