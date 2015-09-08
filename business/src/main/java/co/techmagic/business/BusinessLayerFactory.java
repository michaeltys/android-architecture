package co.techmagic.business;

public class BusinessLayerFactory {

    public static IUserBusinessLayer getUserBusinessLayer() {
        return new UserBusinessLayer();
    }
}
