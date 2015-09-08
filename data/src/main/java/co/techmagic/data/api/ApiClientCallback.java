package co.techmagic.data.api;

public interface ApiClientCallback<T> {

	void onSuccess(T response);

	void onError(int code, String message);
}
