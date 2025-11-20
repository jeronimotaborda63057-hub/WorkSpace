import java.util.List;

public abstract class RISEncoder<T> implements Encodable<T> {

    @Override
    public String[] getFieldNames() {
        return null;
    }

    @Override
    public String[] getFieldValues(T type) {
        return null;
    }

    @Override
    public String createField(String name, Object value) {
        return name + "  - " + value;
    }

    public String createReferenceTypeField(String type) {
        return createField("TY", type);
    }

    public String createAuthorField(String author) {
        return createField("AU", author);
    }

    public String createTitleField(String title) {
        return createField("TI", title);
    }

    public String createJournalField(String journal) {
        return createField("JO", journal);
    }

    public String createYearField(int year) {
        return createField("PY", year);
    }

    public String createVolField(int vol) {
        return createField("VL", vol);
    }

    public String createDoiField(String doi) {
        return createField("DO", doi);
    }

    public String createUrlField(String url) {
        return createField("UR", url);
    }

    public String createAbstractField(String abstractText) {
        return createField("AB", abstractText);
    }

    public String createEndField() {
        return createField("ER", "");
    }

    @Override
    public String encode(T type) {
        String[] fields = getFields(type);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            sb.append(fields[i] + "\n");
        }
        return sb.toString();
    }

    @Override
    public String encode(List<T> list) {
        StringBuilder sb = new StringBuilder();

        for (T type : list) {
            sb.append(encode(type));
        }
        return sb.toString();
    }
}
