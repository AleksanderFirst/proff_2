package file_system_analyzer;


import file_system_analyzer_rec.FileSystemAnalyzerRec;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FileSystemAnalyzerRecTest {
    FileSystemAnalyzerRec analyzer;

    public FileSystemAnalyzerRecTest() throws IOException {
        analyzer = new FileSystemAnalyzerRec("d:/distr/");
        System.out.println(analyzer);
    }

    @Test
    public void testHiddenCount() {
        Assert.assertEquals(15, analyzer.getFileTypesCount());
        Assert.assertEquals(0, analyzer.getHiddenFilesCount());
    }
}

