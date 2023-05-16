public class Man extends Person {
    private Woman partner;

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Woman getPartner() {
        return partner;
    }

    public void setPartner(Woman partner) {
        this.partner = partner;
    }

    public void registerPartnership() {
        if (partner != null) {
            partner.setLastName(getLastName());
        }
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (partner != null && returnToPreviousLastName) {
            partner.setLastName(partner.getLastName());
        }
        partner = null;
    }
}

