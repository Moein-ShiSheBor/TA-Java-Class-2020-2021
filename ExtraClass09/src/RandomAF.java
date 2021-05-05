import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAF {
    private final int F_NAME_LEN = 15;
    private final int L_NAME_LEN = 25;
    private RandomAccessFile raf;
    private String fileName;

    /**
     * @param fileName
     * @throws FileNotFoundException
     */
    public RandomAF(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        raf = new RandomAccessFile(fileName, "rw");
    }

    /**
     * @param user
     * @param position
     * @throws IOException
     */
    public void writeUser(User user, int position) throws IOException {
        raf.seek(position);
        writeUser(user);
    }

    /**
     * @param user
     * @throws IOException
     */
    public void writeUserEnd(User user) throws IOException {
        raf.seek(raf.length());
        writeUser(user);
    }

    /**
     * @param user
     * @throws IOException
     */
    private void writeUser(User user) throws IOException {
        raf.writeInt(user.getId());
        raf.writeChars(fixe(user.getFName(), F_NAME_LEN));
        raf.writeChars(fixe(user.getLName(), L_NAME_LEN));
        raf.writeInt(user.getAge());
        raf.writeDouble(user.getAvg());
    }

    /**
     * @param num
     * @return
     * @throws IOException
     */
    public User readUser(int num) throws IOException {
        raf.seek((num - 1) * 96);
        return readUser();
    }

    /**
     * @return
     * @throws IOException
     */
    public User readUser() throws IOException {
        User newUser = new User();
        newUser.setId(raf.readInt());
        String fName = "";
        for (int i = 0; i < F_NAME_LEN; i++)
            fName += raf.readChar();
        newUser.setFName(fName.trim());
        String lName = "";
        for (int i = 0; i < L_NAME_LEN; i++)
            lName += raf.readChar();
        newUser.setlName(lName.trim());
        newUser.setAge(raf.readInt());
        newUser.setAvg(raf.readDouble());
        return newUser;
    }

    /**
     * this method fixe the length of String inputs with a specific length for writhing in file
     * @param str
     * @param length
     * @return
     */
    private String fixe(String str, int length) {
        if (str.length() > length) {
            return str.substring(0, length);
        } else {
            int mines = length - str.length();
            for (int i = 0; i < mines; i++)
                str += " ";
            return str;
        }
    }

    /**
     * @throws IOException
     */
    public void closeFile() throws IOException {
        raf.close();
        System.out.println("File Closed");
    }
}
