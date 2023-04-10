package staff;

public class StaffController {

    private TravelAdvisor advisor;
    private OfficeManager manager;
    private SystemAdministrator admin;

    public StaffController(){}

    public void setAdvisor(TravelAdvisor advisor) {
        this.advisor = advisor;
    }

    public TravelAdvisor getAdvisor() {
        return advisor;
    }

    public void setManager(OfficeManager manager) {
        this.manager = manager;
    }

    public OfficeManager getManager() {
        return manager;
    }

    public void setAdmin(SystemAdministrator admin) {
        this.admin = admin;
    }

    public SystemAdministrator getAdmin() {
        return admin;
    }
}
