package file_system_analyzer;


import org.apache.commons.io.DirectoryWalker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FileSystemAnalyzer extends DirectoryWalker {
    private String rootDirectory;
    private HashMap<String, FileTypeInfo> fileMap = new HashMap<String, FileTypeInfo>();
    private ArrayList<String> emptyList = new ArrayList<String>();

    private HashMap<String, FileTypeInfo> getFileMap() {
        return fileMap;
    }

    public FileSystemAnalyzer(String rootDirectory) throws IOException {
        super();
        this.rootDirectory = rootDirectory;
        this.walk();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, FileTypeInfo> entry : getFileMap().entrySet()) {
            stringBuilder.append("FILE TYPE: ").append(entry.getKey()).append("\nTOTAL SIZE = ").append(entry.getValue().summarySize).append(" bytes");
            stringBuilder.append("\nHIDDEN FILES: ").append(entry.getValue().hiddenFiles.size()).append("\n").append(entry.getValue().hiddenFiles).append("\n\n");
        }
        return stringBuilder.toString();

    }

    @Override
    protected void handleFile(File file, int depth, Collection results) throws IOException {
        String fileType = file.getName().substring(file.getName().lastIndexOf('.') + 1);
        if (getFileMap().containsKey(fileType)) {
            FileTypeInfo exist = getFileMap().get(fileType);
            if (file.isHidden()) {
                exist.hiddenFiles.add(file.getCanonicalPath());
            }
            exist.summarySize += file.length();

        } else {
            FileTypeInfo fileTypeInfo = new FileTypeInfo(fileType);
            if (file.isHidden()) {
                fileTypeInfo.hiddenFiles.add(file.getCanonicalPath());
            }
            fileTypeInfo.summarySize += file.length();
            getFileMap().put(fileType, fileTypeInfo);
        }
    }


    private void walk() throws IOException {
        walk(new File(rootDirectory), emptyList);

    }

    public int getFileTypesCount() {
        return getFileMap().size();
    }

    public int getHiddenFilesCount() {
        int count = 0;
        for (Map.Entry<String, FileTypeInfo> entry : getFileMap().entrySet())
        {
            count+=entry.getValue().hiddenFiles.size();
        }
        return count;
    }


    private class FileTypeInfo {
        private String fileType;
        private ArrayList<String> hiddenFiles = new ArrayList<String>();
        private long summarySize;

        public FileTypeInfo(String fileType) {
            this.fileType = fileType;
        }
    }
}
