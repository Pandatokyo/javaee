package servlets;

import classes.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getPathInfo() == null || req.getPathInfo().equals("/")) {
            List<Product> products = new ArrayList<>();
            products.add(new Product(1, "milk", "new milk", 1.1));
            products.add(new Product(2, "coffee", "warm coffee", 25));
            products.add(new Product(3, "shake", "shake", 10));
            products.add(new Product(4, "tea", "cheap tea", 3.2));
            products.add(new Product(5, "steak", "delicious", 50));
            products.add(new Product(6, "juice", "juicy", 5));
            products.add(new Product(7, "chocolate", "white chocolate", 76.3));
            products.add(new Product(8, "cola", "pretty new", 13.2));
            products.add(new Product(9, "wok", "spicy", 1));
            products.add(new Product(10, "snack", "new snack", 12));
            for (Product item: products) {
                resp.getWriter().printf(item.getInfo() + '\n');
            }
        }
    }
}