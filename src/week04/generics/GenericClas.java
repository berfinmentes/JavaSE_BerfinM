package week04.generics;

public class GenericClas<T> {

    private T data;
    public GenericClas(T data){
        this.data = data;

    }
    public T getData(){
        return data;
    }
}
