import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationKeyword {
    private String name;

    public static void main(String[] args) {

        try
        {
            String userDirectory = System.getProperty("user.dir");

            DeserializationKeyword d;
            File fc = new File(userDirectory+"/file.txt");
            fc.createNewFile();
            FileInputStream f = new FileInputStream(userDirectory+"/file.txt");
            ObjectInputStream oos = new ObjectInputStream(f);
            d = (DeserializationKeyword)oos.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
