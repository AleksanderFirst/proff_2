package file_system_analyzer;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FileSystemAnalyzerTest {
    FileSystemAnalyzer analyzer;

    public FileSystemAnalyzerTest() throws IOException {
        analyzer = new FileSystemAnalyzer("d:/distr/");
        System.out.println(analyzer);
    }

    @Test
    public void testHiddenCount() {
        Assert.assertEquals(15, analyzer.getFileTypesCount());
        Assert.assertEquals(0, analyzer.getHiddenFilesCount());
    }
}
