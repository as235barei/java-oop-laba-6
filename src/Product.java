public class Product {
    private String name;
    private String manufacturer;
    private int quantity;
    private double wholesalePrice;
    private double retailPrice;
    private int warrantyPeriod;

    public Product (String name, String manufacturer, int quantity, double wholesalePrice, double retailPrice, int warrantyPeriod) throws IllegalArgumentException {

        if (name.length() < 3) {
            throw new IllegalArgumentException("Назва товару повинна містити не менше 3 символів.");
        }
        if (manufacturer.length() < 5) {
            throw new IllegalArgumentException("Назва виробника повинна містити не менше 5 символів.");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Кількість товару не може бути негативною.");
        }
        if (wholesalePrice <= 0 || retailPrice <= 0) {
            throw new IllegalArgumentException("Ціна повинна бути більшою за 0.");
        }
        if (wholesalePrice > retailPrice) {
            throw new IllegalArgumentException("Оптова ціна не може бути більшою за роздрібну.");
        }
        if (retailPrice < wholesalePrice * 0.5) {
            throw new IllegalArgumentException("Роздрібну ціну не можна знизити більш ніж на 50% від оптової.");
        }
        if (warrantyPeriod < 1) {
            throw new IllegalArgumentException("Гарантійний термін повинен бути не менше 1 місяця.");
        }

        this.name = name;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public double getProfit() {
        return (retailPrice - wholesalePrice) * quantity;
    }

    @Override
    public String toString() {
        return "Товар: " + name + ", Виробник: " + manufacturer + ", Кількість: " + quantity +
                ", Оптова ціна: " + wholesalePrice + ", Роздрібна ціна: " + retailPrice + ", Гарантія: " + warrantyPeriod + " місяців";
    }


}
