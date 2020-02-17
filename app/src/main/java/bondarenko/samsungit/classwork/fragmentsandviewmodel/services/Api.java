package bondarenko.samsungit.classwork.fragmentsandviewmodel.services;

import bondarenko.samsungit.classwork.fragmentsandviewmodel.models.Reciepe;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("/")
    public Call<Reciepe> getReciepe();
}
