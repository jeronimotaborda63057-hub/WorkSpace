import java.util.List;

public interface Encodable<T> {

    public abstract String[] getFieldNames();
    public abstract String[] getFieldValues(T type);
    public abstract String encode(T type);
    public abstract String encode(List<T> list);
    public abstract String createField(String name, Object value);
    public abstract String[] getFields(T type);
    
}
