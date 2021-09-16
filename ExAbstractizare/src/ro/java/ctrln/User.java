package ro.java.ctrln;

import java.util.Objects;
import java.util.ArrayList;

public class User implements Orders, ReturnOrder, WishList{
    private String email;
    private String username;
    private final String password;
    private String homeAddress;

    public User(String email, String katPart1, String password, String homeAddress) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.homeAddress = homeAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email) && username.equals(user.username) && password.equals(user.password) && homeAddress.equals(user.homeAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, username, password, homeAddress);
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }

    @Override
    public void showOrders(ArrayList <String> orders) {
        for (int i = 0; i < orders.size(); i++) {
            System.out.println("Comanda numarul " + i + " este " + orders.get(i));
        }

    }

    @Override
    public void returnOrder(int orderId, String product) {
        System.out.println("Numarul comenzii returnate este " + orderId + " iar produsul returnat este " + product);

    }

    @Override
    public void wishList(ArrayList<String> wishList) {
        for (int i = 0; i < wishList.size(); i++) {
            System.out.println("Produsul dorit " + i + " este " + wishList.get(i));
        }
    }
}
