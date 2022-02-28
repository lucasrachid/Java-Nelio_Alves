package Application;

import Entities.ProdutosEmEstoque;
import java.util.Locale;
import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);

        ProdutosEmEstoque produto01;
        produto01 = new ProdutosEmEstoque();

        System.out.println("Enter product data:");
        System.out.printf("Name: ");
        produto01.name = ed.nextLine();
        System.out.printf("Price: ");
        produto01.price = ed.nextDouble();
        System.out.printf("Quantity in stock: ");
        produto01.quantity = ed.nextInt();

        double valueStock = produto01.totalValueInStock(produto01.price, produto01.quantity);

//      System.out.printf("Product data: %s, %.2f, %d units, Total: %.2f", produto01.name, produto01.price, produto01.quantity, valueStock);
        System.out.printf("Product data: " + produto01.toString());
        System.out.printf("%n%nInsert the number of products to be added in stock: ");

        int addStock = ed.nextInt();
        produto01.addProducts(addStock);
        double valueStockUpdated = produto01.totalValueInStock(produto01.price, produto01.quantity);

//      System.out.printf("%nUpdated data: %s, %.2f, %d units, Total: %.2f", produto01.name, produto01.price, produto01.quantity, valueStockUpdated);
        System.out.printf("Updated data: " + produto01.toString(), valueStockUpdated);

        System.out.printf("%n%nInsert the number of products to be removed in stock: ");

        int removeStock = ed.nextInt();
        produto01.removeProducts(removeStock);
        valueStockUpdated = produto01.totalValueInStock(produto01.price, produto01.quantity);

//      System.out.printf("%nUpdated data: %s, %.2f, %d units, Total: %.2f", produto01.name, produto01.price, produto01.quantity, valueStockUpdated);
        System.out.printf("Updated data: " + produto01.toString(), valueStockUpdated);
        ed.close();
    }
}
