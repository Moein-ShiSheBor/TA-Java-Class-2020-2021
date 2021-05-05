import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAF {
    private RandomAccessFile raf;
    private String fileName;

    public RandomAF(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        raf = new RandomAccessFile(fileName, "rw");
    }

    public void writeUser(User user, int position) throws IOException {
        raf.seek(position);
        writeUser(user);
    }

    public void writeUserEnd(User user) throws IOException {
        raf.seek(raf.length());
        writeUser(user);
    }

    private void writeUser(User user) throws IOException {
        raf.writeInt(user.getId());
        raf.writeInt(user.getFName().length());
        raf.writeChars(user.getFName());
        raf.writeInt(user.getLName().length());
        raf.writeChars(user.getLName());
        raf.writeInt(user.getAge());
        raf.writeDouble(user.getAvg());
    }

    public User readUser(int position) throws IOException {
        raf.seek(position);
        return readUser();
    }


    public User readUser() throws IOException {
        User newUser = new User();
        newUser.setId(raf.readInt());
        int fNameLength = raf.readInt();
        String fName = "";
        for (int i = 0; i < fNameLength; i++)
            fName += raf.readChar();
        newUser.setFName(fName);
        int lNameLength = raf.readInt();
        String lName = "";
        for (int i = 0; i < lNameLength; i++)
            lName += raf.readChar();
        newUser.setlName(lName);
        newUser.setAge(raf.readInt());
        newUser.setAvg(raf.readDouble());
        return newUser;
    }

    public void closeFile() throws IOException {
        raf.close();
        System.out.println("File Closed");
    }
}
