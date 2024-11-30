import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductSet implements ProductOperations {
    private List<Product> products;

    public ProductSet() {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) throws Exception {
        for (Product p : products) {
            if (p.getName().equals(product.getName()) && p.getManufacturer().equals(product.getManufacturer())) {
                throw new Exception("Такий товар вже існує з іншим гарантійним терміном.");
            }
        }
        products.add(product);
    }

    @Override
    public void printProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public ProductSet mergeSets(ProductSet otherSet) {
        ProductSet mergedSet = new ProductSet();
        mergedSet.products.addAll(this.products);

        for (Product otherProduct : otherSet.products) {
            boolean found = false;
            for (Product thisProduct : mergedSet.products) {
                if (thisProduct.getName().equals(otherProduct.getName()) && thisProduct.getManufacturer().equals(otherProduct.getManufacturer())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(found);

                mergedSet.products.add(otherProduct);
            }
        }

        return mergedSet;
    }

    @Override
    public void sortByExpectedProfit() {
        products.sort(Comparator.comparingDouble(Product::getProfit).reversed());
    }

}
