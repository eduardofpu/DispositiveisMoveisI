package wpattern.org.mutracksimple.packagee;


import wpattern.org.mutracksimple.user.UserBean;

/**
 * Created by Eduardo on 02/09/2016.
 */
public class PackageeBean {

    private String name;
    private String code;
    private String description;
    private String registerDate;
    private UserBean userBean;

    public PackageeBean(){

    }

    public PackageeBean(String name, String code, String description) {
        this.name = name;
        this.code = code;
        this.description = description;
    }

    public PackageeBean(String name, String code, String description, String registerDate, UserBean userBean) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.registerDate = registerDate;
        this.userBean = userBean;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }
}
