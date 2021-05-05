import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RAF {
    private RandomAccessFile raf;
    private String fileName;

    public RAF(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        raf = new RandomAccessFile(fileName, "rw");
    }
}
