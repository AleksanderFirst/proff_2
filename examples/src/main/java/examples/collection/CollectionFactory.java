package examples.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by randriyanov on 30.06.15.
 */
public class CollectionFactory {

    public ICollectionAnalyzer analyzeCollection(Collection c) {
        if(c instanceof ArrayList) {
            return new ArrayListAnalyzerImpl();
        }
        return null;

    }

}
