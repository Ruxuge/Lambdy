
import model.Product;
import interfaces.ProductLabelChecker;

    public class SimpleProductChecker implements ProductLabelChecker {

        @Override
        public void checkLabel(Product product) {
            if (product.getName().length() > 0) {
                System.out.println("Name is set.");
            }
        }
    }
