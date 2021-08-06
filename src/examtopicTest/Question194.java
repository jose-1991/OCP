package examtopicTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employee {
    Optional<Address> address;
    Employee (Optional<Address> address) {
        this.address = address;
    }
    public Optional<Address> getAddress() { return address; }
}
class Address {
    String city = "New York";
    public String getCity() { return city; }
    public String toString() {
        return city;
    }
}
public class Question194 {
    public static void main(String[] args) {
        Address address = new Address();
        Optional<Address> addrs1 = Optional.ofNullable (address);
        Employee e1 = new Employee (addrs1);
        String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
        System.out.println(eAddress);


        System.out.println("================= #198 ================");
        List<String> codes = Arrays.asList("B","C","A","D");
        codes.parallelStream().forEach(System.out::print);
        System.out.println("");
        codes.parallelStream().forEachOrdered(System.out::print);

    }
}
