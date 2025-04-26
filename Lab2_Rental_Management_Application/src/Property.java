public class Property {
    private String PropertyID;
    private String Description;
    private String PropertyOwnerId;

    public Property() {
    }

    public Property(String propertyID, String description, String propertyOwnerId) {
        PropertyID = propertyID;
        Description = description;
        PropertyOwnerId = propertyOwnerId;
    }

    public String getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(String propertyID) {
        PropertyID = propertyID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPropertyOwnerId() {
        return PropertyOwnerId;
    }

    public void setPropertyOwnerId(String propertyOwnerId) {
        PropertyOwnerId = propertyOwnerId;
    }

}
