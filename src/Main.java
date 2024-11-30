public class Main {
    public static void main(String[] args) {
        try {
            ProductSet productSet = new ProductSet();

            // Створюємо продукти
            Product product1 = new Product("Ноутбук", "Samsung", 10, 500.0, 600.0, 12);
            Product product2 = new Product("Телефон", "Apple", 5, 700.0, 900.0, 24);

            // Додаємо продукти в множину
            productSet.addProduct(product1);
            productSet.addProduct(product2);

            // Виведення товарів
            System.out.println("Товари в множині:");
            productSet.printProducts();

            // Сортування за очікуваним прибутком
            productSet.sortByExpectedProfit();
            System.out.println("\nТовари після сортування за очікуваним прибутком:");
            productSet.printProducts();

            // Обробка винятків:
//            Спроба додати товар з тим самим найменуванням та виробником, але з іншим гарантійним терміном
//            Product invalidProduct = new Product("Ноутбук", "Samsung", 5, 500.0, 600.0, 6);

//            1. Спроба додати товар з назвою менше 3 символів
//             Product invalidProduct = new Product("PC", "Samsung", 10, 500.0, 600.0, 12);
//            2. Спроба додати товар з назвою виробника менше 5 символів
//            Product invalidProduct = new Product("Ноутбук", "LG", 10, 500.0, 600.0, 12);
//            3. Спроба додати товар з негативною кількістю
            Product invalidProduct = new Product("телофон", "Samsung", 5, 500.0, 600.0, 12);
//            4. Спроба додати товар з оптовою ціною, що вища за роздрібну
//            Product invalidProduct = new Product("Ноутбук", "Samsung", 10, 700.0, 600.0, 12);
//            5. Спроба додати товар з ціною нижчою ніж 50% від оптової
//            Product invalidProduct = new Product("Ноутбук", "Samsung", 10, 500.0, 200.0, 12);
//            6. Спроба додати товар з гарантійним терміном менше 1 місяця
//            Product invalidProduct = new Product("Ноутбук", "Samsung", 10, 500.0, 600.0, 0);
//            7. Спроба додати товар із ціною, рівною 0 або меншою
//            Product invalidProduct = new Product("Ноутбук", "Samsung", 10, 0, 600.0, 12);
            productSet.addProduct(invalidProduct);

        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}