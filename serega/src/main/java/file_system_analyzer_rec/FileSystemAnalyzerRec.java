package file_system_analyzer_rec;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FileSystemAnalyzerRec {
    private HashMap<String, FileTypeInfo> fileMap = new HashMap<String, FileTypeInfo>();

    public FileSystemAnalyzerRec(String folder) throws IOException {
        analyze(new File(folder));
    }

    private HashMap<String, FileTypeInfo> getFileMap() {
        return fileMap;
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

        public String getFileType() {
            return fileType;
        }
    }



    public static void main(String[] args) throws IOException {
        String folder = "c:/temp/";
        FileSystemAnalyzerRec analyzer = new FileSystemAnalyzerRec(folder);
        System.out.println(analyzer);

    }

    public void analyze(File directory) throws IOException {
        if (!directory.exists()){
            System.out.println("Invalid path!");
            return;
        }
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                analyze(file);
            } else{
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
        }
    }
}
