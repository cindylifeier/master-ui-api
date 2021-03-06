package gov.samhsa.c2s.masteruiapi.infrastructure;

public enum SupportedRoles {
    PATIENT("patient"),
    PROVIDER("provider"),
    STAFF("staff");

    private String name;

    SupportedRoles(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
