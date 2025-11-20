import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE_NAME = "References.ris";
    public static void main(String[] args) {

        String risContent = null;

        RISEncoder<Reference> encoder = new RISEncoder<Reference>() {
            
            @Override
            public String[] getFields(Reference reference) {
                List<String> fields = new ArrayList<>();
                fields.add(createReferenceTypeField(reference.getReferenceTyoe()));
                for (String author : reference.getAuthors()) {
                    fields.add(createAuthorField(author));
                }
                fields.add(createTitleField(reference.getTitle()));
                fields.add(createJournalField(reference.getJournal()));
                fields.add(createYearField(reference.getYear()));
                fields.add(createVolField(reference.getVolume()));
                fields.add(createDoiField(reference.getDoi()));
                fields.add(createUrlField(reference.getUrl()));
                fields.add(createAbstractField(reference.getAbstract()));
                fields.add(createEndField() + "\n");

                return fields.toArray(String[]::new);
            }
        };

        List<Reference> referenceList = createTestReferences();
        
        risContent = encoder.encode(referenceList);
        System.out.println(risContent);

        FileUtils.saveToFile(FILE_NAME, risContent);
    }

    public static List<Reference> createTestReferences() {
        List<Reference> referenceList = new ArrayList<>();
        List<String> authors = null;
        Reference reference = null;

        // Reference 1
        reference = new Reference();
        reference.setReferenceType("JOUR");
        authors = new ArrayList<>();
        authors.add("Goodfellow, Ian");
        authors.add("Bengio, Yoshua");
        authors.add("Courville, Aaron");
        reference.setAuthors(authors);
        reference.setTitle("Deep Learning");
        reference.setJournal("MIT press");
        reference.setYear(2016);
        referenceList.add(reference);

        // Reference 2
        reference = new Reference();
        reference.setReferenceType("JOUR");
        authors = new ArrayList<>();
        authors.add("Sutton, Richard");
        authors.add("Barto, Andrew");
        reference.setAuthors(authors);
        reference.setTitle("Reinforcement Learning: An Introduction");
        reference.setJournal("MIT press");
        reference.setYear(2018);
        referenceList.add(reference);

        // Reference 3
        reference = new Reference();
        reference.setReferenceType("JOUR");
        authors = new ArrayList<>();
        authors.add("Tan, M.");
        authors.add("Le, Q. V.");
        reference.setAuthors(authors);
        reference.setTitle("EfficientNet: Rethinking Model Scaling for Convolutional Neural Networks.");
        reference.setJournal("International Conference on Machine Learning");
        reference.setYear(2019);
        referenceList.add(reference);

        // Reference 4
        reference = new Reference();
        reference.setReferenceType("JOUR");
        authors = new ArrayList<>();
        authors.add("Krizhevsky, Alex");
        authors.add("Sutskever, Ilya");
        authors.add("Hinton, Geoffrey");
        reference.setAuthors(authors);
        reference.setTitle("ImageNet Classification with Deep Convolutional Neural Networks");
        reference.setJournal("NIPS");
        reference.setYear(2012);
        referenceList.add(reference);

        // Reference 5
        reference = new Reference();
        reference.setReferenceType("JOUR");
        authors = new ArrayList<>();
        authors.add("Vaswani, Ashish");
        authors.add("Shazeer, Noam");
        authors.add("Parmar, Niki");
        authors.add("et al.");
        reference.setAuthors(authors);
        reference.setTitle("Attention Is All You Need");
        reference.setJournal("NIPS");
        reference.setYear(2017);
        referenceList.add(reference);

        // Reference 6
        reference = new Reference();
        reference.setReferenceType("JOUR");
        authors = new ArrayList<>();
        authors.add("He, Kaiming");
        authors.add("Zhang, Xiangyu");
        authors.add("Ren, Shaoqing");
        authors.add("Sun, Jian");
        reference.setAuthors(authors);
        reference.setTitle("Deep Residual Learning for Image Recognition");
        reference.setJournal("CVPR");
        reference.setYear(2016);
        referenceList.add(reference);

        // Reference 7
        reference = new Reference();
        reference.setReferenceType("JOUR");
        authors = new ArrayList<>();
        authors.add("Hochreiter, Sepp");
        authors.add("Schmidhuber, Jürgen");
        reference.setAuthors(authors);
        reference.setTitle("Long Short-Term Memory");
        reference.setJournal("Neural Computation");
        reference.setYear(1997);
        referenceList.add(reference);

        // Reference 8
        reference = new Reference();
        reference.setReferenceType("JOUR");
        authors = new ArrayList<>();
        authors.add("Mikolov, Tomas");
        authors.add("Chen, Kai");
        authors.add("Corrado, Greg");
        authors.add("Dean, Jeffrey");
        reference.setAuthors(authors);
        reference.setTitle("Efficient Estimation of Word Representations in Vector Space");
        reference.setJournal("arXiv");
        reference.setYear(2013);
        referenceList.add(reference);

        // Reference 9
        reference = new Reference();
        reference.setReferenceType("JOUR");
        authors = new ArrayList<>();
        authors.add("Brooks, Rodney A.");
        reference.setAuthors(authors);
        reference.setTitle("Intelligence Without Representation");
        reference.setJournal("Artificial Intelligence Journal");
        reference.setYear(1991);
        referenceList.add(reference);

        // Reference 10
        reference = new Reference();
        reference.setReferenceType("JOUR");
        authors = new ArrayList<>();
        authors.add("Stone, Peter");
        authors.add("Sutton, Richard");
        authors.add("Kuhlmann, Gregory");
        reference.setAuthors(authors);
        reference.setTitle("Reinforcement Learning for RoboCup Soccer Keepaway");
        reference.setJournal("Adaptive Behavior");
        reference.setYear(2008);
        referenceList.add(reference);

        return referenceList;
    }

}
