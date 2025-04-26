import java.util.Scanner;

public class Property {
    private static Scanner sc = new Scanner(System.in);

    private int PropertyID;
    private String Description;
    private String Property;

    public Property() {

    }

    public Property(int propertyID, String description, String property) {
        PropertyID = propertyID;
        Description = description;
        Property = property;
    }

    public int getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(int propertyID) {
        PropertyID = propertyID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getProperty() {
        return Property;
    }

    public void setProperty(String property) {
        Property = property;
    }
}
