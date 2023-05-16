public class Woman extends Person {
    private Man partner;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Man getPartner() {
        return partner;
    }

    public void setPartner(Man partner) {
        this.partner = partner;
    }

    public void registerPartnership() {
        if (partner != null) {
            setLastName(partner.getLastName());
        }
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (partner != null && returnToPreviousLastName) {
            setLastName(getLastName());
        }
        partner = null;
    }
}
