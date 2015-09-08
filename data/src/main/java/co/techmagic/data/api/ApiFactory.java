package co.techmagic.data.api;

public class ApiFactory {

    public static IUserApi getUserApi() {
        return new UserApi();
    }
}
