package co.techmagic.data.dataprovider;

public class DataProviderFactory {

    public static IUserDataProvider getUserDataProvider() {
        return new UserDataProvider();
    }

}
