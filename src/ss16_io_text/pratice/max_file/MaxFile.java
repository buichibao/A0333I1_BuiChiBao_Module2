package ss16_io_text.pratice.max_file;

public class MaxFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        readAndWriteFile.writeFile("src\\ss16_io_text\\pratice\\max_file\\max1", FindMaxValue.findMax(readAndWriteFile.readFile("src\\ss16_io_text\\pratice\\max_file\\max")));
    }
}
