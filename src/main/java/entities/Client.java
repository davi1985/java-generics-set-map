package entities;

public class Client {

    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Client client = (Client) object;
        return getName().equals(client.getName()) && getEmail().equals(client.getEmail());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getEmail().hashCode();
        return result;
    }
}
