
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Zadanie2 {


        public static void main(String[] args) {
            Supplier<Object> objectCreator = Object::new;
            Object objectInstance = objectCreator.get();
            System.out.println(objectInstance);

            BiPredicate<Object, Object> equalsMethodOnClass = Object::equals;
            System.out.println(equalsMethodOnClass.test(objectInstance, new Object()));

            Predicate<Object> equalsMethodOnObject = objectInstance::equals;
            System.out.println(equalsMethodOnObject.test(new Object()));
        }

}

